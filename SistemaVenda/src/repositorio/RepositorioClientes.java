
package repositorio;

import dados.Clientes;
import java.util.ArrayList;


public class RepositorioClientes {

    private static ArrayList<Clientes> listaClientes = new ArrayList();
    
    
   
    public static void inicializandoDados() {
        
        // criando os objetos diretamente

        
  

    }
    
    
   
    public static void adicionarProduto(Clientes c) {
        
       
        listaClientes.add(c);
    }
    
 
    public static boolean temEspaco() {

        return listaClientes != null; 
    }
    
   
    public static Clientes pesquisarClientesPeloCodigo(int codigo) {
        Clientes clientes = null;
        
   
        for (Clientes clientesAtual : listaClientes) {
            if (clientesAtual.getCodigo() == codigo) {
                // achei o produto com o codigo correspondente
                clientes = clientesAtual;
                break;
            }
        }


        
        return clientes;
    }

    
    public static void editarProduto(Clientes clientes) {
        
        for (Clientes c : listaClientes) {
            if (c.getCodigo() == clientes.getCodigo()) {
                c = clientes;
                break;
            }
        }
        

    }
    
} // fim classe

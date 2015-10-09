
package repositorio;

import dados.Clientes;
import java.util.ArrayList;



public class RepositorioClientes {

    private static ArrayList<Clientes> listaClientes = new ArrayList();
    
    public static void inicializandoClientes(){
    
         Clientes c1 = new Clientes("HAHA", "HEHE", "HIHI", "HUHU", "HOHO", "HHHH");
        Clientes c2 = new Clientes("LKS", "CTX", "PQP", "LCS", "MZR", "FDP");
        
        listaClientes.add(c1);
        listaClientes.add(c2);
       
        
    
    }
    
    
    
   
 public static void adicionarClientes(Clientes c) {
        
       
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

    
    public static void editarClientes(Clientes clientes) {
        
        for (Clientes c : listaClientes) {
            if (c.getCodigo() == clientes.getCodigo()) {
                c = clientes;
                break;
            }
        }
    }
        
         public static String excluirCliente (Clientes excluirCliente){
           listaClientes.remove(excluirCliente);
           String ex = "\n Excluido";
           return ex;

    }
    
} 
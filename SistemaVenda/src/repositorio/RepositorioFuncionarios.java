/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import dados.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class RepositorioFuncionarios {
    
 private static ArrayList<Funcionario> listaFuncionarios = new ArrayList();
    
    
    /**
     * Estrutura para carregar dados FAKE na memória
     */
    public static void inicializandoDados() {
        
        // criando os objetos diretamente
        Funcionario f1 = new Funcionario("1", "2", "3", "4");
        Funcionario  f2 = new Funcionario("haha", "hehe", "hihi", "hoho");
      
        
    
        listaFuncionarios.add(f1);
        listaFuncionarios.add(f2);
        
    }
    
    
  
    public static void adicionarFuncionario(Funcionario f) {
        
       
        listaFuncionarios.add(f);
    }
    
  
    public static boolean temEspaco() {
        

        return listaFuncionarios != null; 
    }
    
  
  
    public static Funcionario pesquisarFuncionarioPeloCodigo(int codigo) {
        Funcionario funcionario = null;
        
     
        for (Funcionario funcionarioAtual : listaFuncionarios) {
            if (funcionarioAtual.getCodigo() == codigo) {
              
                funcionario = funcionarioAtual;
                break;
            }
        }

        return funcionario;
    }

   
    public static void editarFuncionario(Funcionario funcionario) {
        
        for (Funcionario f : listaFuncionarios) {
            if (f.getCodigo() == funcionario.getCodigo()) {
                f = funcionario;
                break;
            }
        }
        

        
    }

    public static Funcionario adicionarFuncionario(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
        public static String excluirFuncionario (Funcionario excluirFuncionario){
           listaFuncionarios.remove(excluirFuncionario);
           String ee = "\n Excluido";
           return ee;
              
        
    }
    
} 
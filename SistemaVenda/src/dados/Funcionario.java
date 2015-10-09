/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Lucas
 */
public class Funcionario {
    private int codigo;
    private String nome;
    private String rg;
    private String cpf;
    private String tel;
    
    private static int contador = 1;
   

    public Funcionario(String nome, String rg, String cpf, String tel) {
        codigo = contador;
        contador++;
        
      
        
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.tel = tel;
    }

     public void imprimirDados() {
       
        System.out.println( toString() );
        
     }

    @Override
    public String toString() {
        String relatorio = "";
      relatorio += "Codigo: "+codigo; 
      relatorio += "\nNome: "+nome;
      relatorio += "\nRG: "+rg;
      relatorio += "\nCPF: "+cpf;
      relatorio += "\nTelefone: "+tel;
    
        
        return relatorio;
    }
     
     
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    }


package dados;


public class Clientes {
    
    private String nome;
    private String cpf;
    private int codigo;
    private String endereco;   
    private String telefone;
    private String email;
    private String sexo;
    
    
 private static int contador = 1;

    public Clientes(String nome, String cpf, String endereco, String telefone, String email, String sexo) {
       codigo = contador;
       contador++;
        
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        
        
    }
    public void imprimirDados() {
       
        System.out.println( toString() );
   }
   
   
    

    @Override
    public String toString() {
      String relatorio = "";
      relatorio += "Codigo: "+codigo; 
      relatorio += "\nNome: "+nome;
      relatorio += "\nCPF: "+cpf;
      relatorio += "\nSexo: "+sexo;
      relatorio += "\nemail: "+email;
      relatorio += "\nTelefone: "+telefone;
      
      return relatorio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

  
   

    }
    
    
    
    


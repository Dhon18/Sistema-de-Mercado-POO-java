package Class_Get_Set_Met;
public class Informacoes_de_Cliente {
   private String nome, sobrenome;
    private int idade, cpf;

    public Informacoes_de_Cliente() {
    }

    public Informacoes_de_Cliente(String nome, String sobrenome, int idade, int cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "Informacoes de Cliente\n {" + "nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", cpf=" + cpf + "\n" +'}';
    }
    
      
}
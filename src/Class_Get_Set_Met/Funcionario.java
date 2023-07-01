package Class_Get_Set_Met;
public class Funcionario {
    private String nome;
    private int cpf;
    private double salario;
    private double qtdc;
    private double identi;
    public Funcionario() {
    }
    
    
    public Funcionario(String nome, int cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getQtdc() {
        return qtdc;
    }

    public void setQtdc(double qtdc) {
        this.qtdc = qtdc;
    }

    public double getIdenti() {
        return identi;
    }

    public void setIdenti(double identi) {
        this.identi = identi;
    }
    
    public double comissao(){
        return 0.75;
    }

    public double identi(){
        return getSalario();
    }
    
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + '}';
    }
    
}
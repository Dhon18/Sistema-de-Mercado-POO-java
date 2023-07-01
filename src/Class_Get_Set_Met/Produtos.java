package Class_Get_Set_Met;
public abstract class Produtos {
    private String nomep, fornecedor;
    private int total_mercadoria;
    private float valor;
   
    public Produtos() {
    }

    public Produtos(String nomep, String fornecedor, int total_mercadoria, float valor) {
        this.nomep = nomep;
        this.fornecedor = fornecedor;
        this.total_mercadoria = total_mercadoria;
        this.valor = valor;
    }

    public String getNomep() {
        return nomep;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getTotal_mercadoria() {
        return total_mercadoria;
    }

    public void setTotal_mercadoria(int total_mercadoria) {
        this.total_mercadoria = total_mercadoria;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public abstract double desconto(Produtos p);
    
    
    @Override
    public String toString() {
        return "Cadastro_de_Produtos{" + "nomep=" + nomep + ", fornecedor=" + fornecedor + ", total_mercadoria=" + total_mercadoria + ", valor=" + valor + "\n" +'}';
    }
}
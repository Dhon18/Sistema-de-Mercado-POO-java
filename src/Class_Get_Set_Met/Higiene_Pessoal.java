package Class_Get_Set_Met;
public class Higiene_Pessoal extends Produtos{
    private String categoria;

    public Higiene_Pessoal() {
    }

    public Higiene_Pessoal(String categoria, String nomep, String fornecedor, int total_mercadoria, float valor) {
        super(nomep, fornecedor, total_mercadoria, valor);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString()+"Higiene_Pessoal{" + "categoria=" + categoria +"\n"+'}';
    }
    
    
}
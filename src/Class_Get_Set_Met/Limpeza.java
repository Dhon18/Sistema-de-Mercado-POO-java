package Class_Get_Set_Met;
public class Limpeza extends Produtos{
   private String funcao;

    public Limpeza() {
    }

    public Limpeza(String funcao, String nomep, String fornecedor, int total_mercadoria, float valor) {
        super(nomep, fornecedor, total_mercadoria, valor);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return super.toString()+"Limpeza{" + "funcao=" + funcao + "\n" +'}';
    }
   
    
   
}
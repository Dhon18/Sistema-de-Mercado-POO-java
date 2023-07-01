package Class_Get_Set_Met;
import java.util.Date;
public class Alimentos extends Produtos{
    private Date data_de_validade;

    public Alimentos() {
        
    }

    public Alimentos(Date data_de_validade, String nomep, String fornecedor, int total_mercadoria, float valor){
        //Esta sendo usada para acessar os objetos na classe Mãe que é Produtos
        super(nomep, fornecedor, total_mercadoria, valor);
        this.data_de_validade = data_de_validade;
    }

    public Date getData_de_validade() {
        return data_de_validade;
    }

    public void setData_de_validade(Date data_de_validade) {
        this.data_de_validade = data_de_validade;
    }

    @Override
    public String toString() {
        return super.toString()+"data de validade: "+data_de_validade.getMonth()+"/"+data_de_validade.getYear();
    }
    
    @Override
    public double desconto(Produtos p) {
        return p.getValor() * 0.03;
    }
    
}
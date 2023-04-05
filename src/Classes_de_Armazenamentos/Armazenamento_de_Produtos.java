package Classes_de_Armazenamentos;
import java.util.ArrayList;
import Class_Get_Set_Met.Cadastro_de_Produtos;
public class Armazenamento_de_Produtos {
    public ArrayList<Cadastro_de_Produtos> CDP = new ArrayList<>();
    @Override
    public String toString() {
        return CDP.toString();
    }
}
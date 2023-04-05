package Class_Alfal;
import java.util.Scanner;
import Class_Get_Set_Met.Informacoes_de_Cliente;
import java.util.InputMismatchException;
import Classes_de_Armazenamentos.Armazenamento_de_Clientes;
import Classes_de_Armazenamentos.Armazenamento_de_Produtos;
import Class_Get_Set_Met.Cadastro_de_Produtos;
public class Main {
    public static void main(String[] args) {
        Armazenamento_de_Clientes listclin = new Armazenamento_de_Clientes();
        Armazenamento_de_Produtos lispro = new Armazenamento_de_Produtos();
        Scanner leia = new Scanner(System.in);
        int menu=0;
        boolean rode = true;
        
        
        while(rode){

                
        try{
        System.out.println("====INFORME UMA OPÇÃO====");
        System.out.println("1 - Vender");
        System.out.println("2 - Cadastrar Cliente");
        System.out.println("3 - Listar Clientes");
        System.out.println("4 - Cadastrar Produtros");
        System.out.println("5 - Listar Produtos");
        System.out.println("6 - Sair");
        menu = leia.nextInt();
        }catch(InputMismatchException e){
                    System.out.println("====ERRO DE ENTRADA====");
                    System.out.println("************************");
                    System.out.println("************************");
                    System.out.println("NÃO DIGITE LETRAS APENAS");
                    System.out.println("DIGITE 1 HÁ 6 PARA PARA ");
                    System.out.println("UMA DAS OPÇÕES ACIMA!!!!");
                    int me = 7;
                    System.out.println("************************");
                    System.out.println("************************");
        }
            leia.nextLine();
            switch(menu){
            case 1:
                System.out.println("vender");
                break;
                
                
            case 2:
                System.out.println("================CADASTRANDO=====================");
                System.out.println("Insira o seu primeiro nome: ");
                String nome = leia.nextLine();
                System.out.println("Insira seu sobrenome completo: ");
                String sobrenome = leia.nextLine();
                System.out.println("Informe sua Idade: ");
                int idade = leia.nextInt();
                leia = new Scanner(System.in);
                System.out.println("Informe seu cpf sem pontos e traços: ");
                String cpf = leia.nextLine();
                System.out.println("================================================");
                System.out.println("============CADASTRADO COM SUCESSO!=============");
                System.out.println("================================================\n\n");
                Informacoes_de_Cliente classnome = new Informacoes_de_Cliente();
                classnome.setNome(nome);
                classnome.setSobrenome(sobrenome);
                classnome.setIdade(idade);
                classnome.setCpf(cpf);
                listclin.n.add(classnome);
                break;
                
                
            case 3:
                System.out.println("====LISTA DE TODOS OS PRODUTOS CADASTRADOS====");
                System.out.println(listclin.toString());
                System.out.println("==============================================\n");
                break;
                
                
            case 4:
                System.out.println("==============CADASTRANDO PRODUTO===============");
                System.out.println("Informe o nome do Produto: ");
                String nomep = leia.nextLine();
                System.out.println("Fornecedor: ");
                String fornecedor = leia.nextLine();
                System.out.println("Quantidade do Produto a ser Registrado: ");
                int total_mercadoria = leia.nextInt();
                System.out.println("Valor da Mercadoria: ");
                float valor = leia.nextFloat();
                
                Cadastro_de_Produtos cdpc = new Cadastro_de_Produtos();
                System.out.println("Data de Registro\n ");
                cdpc.setNomep(nomep);
                cdpc.setFornecedor(fornecedor);
                cdpc.setTotal_mercadoria(total_mercadoria);
                cdpc.setValor(valor);
                lispro.CDP.add(cdpc);
                break;
                
                
            case 5:
                System.out.println("====LISTA DE TODOS OS PRODUTOS CADASTRADOS====");
                System.out.println(lispro.toString());
                System.out.println("==============================================\n");
                break;
                
                
            case 6:
                boolean repitamenu = false;
                leia.nextLine();
                break;
            }
        }
    }
}
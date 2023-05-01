package Class_Alfal;
import Class_Get_Set_Met.Alimentos;
import Class_Get_Set_Met.Higiene_Pessoal;
import java.util.Scanner;
import Class_Get_Set_Met.Informacoes_de_Cliente;
import Class_Get_Set_Met.Limpeza;
import java.util.InputMismatchException;
import Classes_de_Armazenamentos.Armazenamento_de_Clientes;
import Classes_de_Armazenamentos.Armazenamento_de_Produtos;
import Class_Get_Set_Met.Produtos;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Armazenamento_de_Clientes listclin = new Armazenamento_de_Clientes();
        Armazenamento_de_Produtos lispro = new Armazenamento_de_Produtos();
        Scanner leia = new Scanner(System.in);
        int menu=0, i, id;
        boolean rode = true;
        
        
        while(rode){

                
        try{
        System.out.println("====INFORME UMA OPÇÃO====");
        System.out.println("1 - Vender");
        System.out.println("2 - Cadastrar Cliente");
        System.out.println("3 - Remover Cliente");
        System.out.println("4 - Listar Clientes");
        System.out.println("5 - Buscar Cliente Especifico");
        System.out.println("6 - Cadastrar Produtros");
        System.out.println("7 - Listar Produtos");
        System.out.println("8 - Remover Produto ");
        System.out.println("9 - Sair");
        menu = leia.nextInt();
        }catch(InputMismatchException e){
                    System.out.println("====ERRO DE ENTRADA====");
                    System.out.println("************************");
                    System.out.println("************************");
                    System.out.println("NÃO DIGITE LETRAS APENAS");
                    System.out.println("DIGITE 1 HÁ 9 PARA PARA ");
                    System.out.println("UMA DAS OPÇÕES ACIMA!!!!");
                    int me = 7;
                    System.out.println("************************");
                    System.out.println("************************");
        }
            leia.nextLine();
            switch(menu){
            case 1:
                
                
                
                
                
                
                break;
                
                
            case 2:
                System.out.println("==============CADASTRANDO CLIENTE=================");
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
                System.out.println("\n \n \n");
                System.out.println("====REMOVER UM CLIENTE====");
                for( i = 0 ; i < listclin.n.size() ; i++){
                    Informacoes_de_Cliente pegacliente = listclin.n.get(i);
                    System.out.println("["+i+"]" + pegacliente.getCpf());
                }
                System.out.println("QUAL NUMERO DE CLIENTE VOCÊ DESEJA REMOVER?");
                id = leia.nextInt();
                listclin.n.remove(id);
                break;
                
                
            case 4:
                System.out.println("====LISTA DE TODOS OS CLIENTES CADASTRADOS====");
                System.out.println(listclin.toString());
                System.out.println("==============================================\n");
                break;
                
            case 5:
                
                System.out.println("===PROCURAR CLIENTE POR CPF====");
                System.out.println("Digite o CPF sem Pontos e Traços: ");
                cpf = leia.nextLine();
                
                for( i = 0 ; i < listclin.n.size() ; i++){
                    Informacoes_de_Cliente pegacliente = listclin.n.get(i);
                if(cpf.equals(pegacliente.getCpf())){
                        System.out.println("\n \n \n");
                        System.out.println("******************************************************");
                        System.out.println("====CLIENTE ENCONTRADO NO SISTEMA====");
                        System.out.println("Nome: " +pegacliente.getNome());
                        System.out.println("Sobrenome: " + pegacliente.getSobrenome());
                        System.out.println("Idade: "+pegacliente.getIdade());
                        System.out.println("CPF: " + pegacliente.getCpf());
                        System.out.println("******************************************************");
                        System.out.println("\n \n");
                       } 
                    }
                break;
            case 6:
                System.out.println("==============CADASTRANDO PRODUTO===============");
                System.out.println("Informe o nome do Produto: ");
                String nomep = leia.nextLine();
                System.out.println("Fornecedor: ");
                String fornecedor = leia.nextLine();
                System.out.println("Quantidade do Produto a ser Registrado: ");
                int total_mercadoria = leia.nextInt();
                System.out.println("Valor da Mercadoria: ");
                float valor = leia.nextFloat();
               
                System.out.println("Que tipo de produto será cadastrado\n1 - Alimentos\n2 - Higiene pessoal\n3 - Limpesa");
                int opProd = leia.nextInt();
                
                if(opProd == 1){
                    System.out.println("Informe a data de Validade do Produtos, Primeiro Digite o Mês depois o Ano: ");
                    Date d = new Date();
                    d.setMonth(leia.nextInt());
                    d.setYear(leia.nextInt());
                    Alimentos alimentos = new Alimentos(d, nomep, fornecedor, total_mercadoria, valor);
                    lispro.CDP.add(alimentos);
                }
                else if(opProd == 2){
                    leia = new Scanner(System.in);
                    System.out.println("Informe a categoria do produto de higiene: ");
                    String categoria = leia.nextLine();
                    Higiene_Pessoal higiene = new Higiene_Pessoal(categoria,nomep, fornecedor, total_mercadoria, valor);
                    lispro.CDP.add(higiene);
                }
                else{
                    leia = new Scanner(System.in);
                    System.out.println("Informe a Funcção do Produto de Limpeza: ");
                    String funcao = leia.nextLine();
                    Limpeza limpeza = new Limpeza(funcao,nomep, fornecedor, total_mercadoria, valor);
                    lispro.CDP.add(limpeza);
                }
                
                /*Produtos cdpc = new Produtos();
                System.out.println("Data de Registro\n ");
                cdpc.setNomep(nomep);
                cdpc.setFornecedor(fornecedor);
                cdpc.setTotal_mercadoria(total_mercadoria);
                cdpc.setValor(valor);*/
                //lispro.CDP.add(alimentos);
                break;
                
            case 7:
                System.out.println("====LISTA DE TODOS OS PRODUTOS CADASTRADOS====");
                System.out.println(lispro.toString());
                System.out.println("==============================================\n");
                break;
                
            case 8:
                System.out.println("\n \n \n");
                System.out.println("====REMOVER UM PRODUTO====");
                for( i = 0 ; i < lispro.CDP.size() ; i++){
                    Produtos removeproduto = lispro.CDP.get(i);
                    System.out.println("["+i+"]" + removeproduto.getNomep());
                }
                System.out.println("QUAL NUMERO DE PRODUTO VOCÊ DESEJA REMOVER?");
                id = leia.nextInt();
                lispro.CDP.remove(id);
                break;
                
            case 9:
                leia.nextLine();
                rode = false;
                leia.nextLine();
                break;
            }
        }
        System.out.println("====SISTEMA ENCERRADO====");
    }
}
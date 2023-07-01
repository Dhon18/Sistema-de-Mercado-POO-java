package Class_Alfal;
//Importação da Classe Alimentos que está no pacote **Class_Get_Set_Met**
import Class_Get_Set_Met.Alimentos;
//Importação da Classe Funcionarios que está no pacote **Class_Get_Set_Met**
import Class_Get_Set_Met.Funcionario;
//Importação da Classe Higiene_Pessoal que está no pacote **Class_Get_Set_Met**
import Class_Get_Set_Met.Higiene_Pessoal;
//Importação do Pacote Scanner para leitura de Dados
import java.util.Scanner;
//Importação da Classe Informacoes_de_Cliente que está no pacote **Class_Get_Set_Met**
import Class_Get_Set_Met.Informacoes_de_Cliente;
//Importação da Classe Limpeza que está no pacote **Class_Get_Set_Met**
import Class_Get_Set_Met.Limpeza;
//Importação de tratamento de Exceção acontece quando fornecemos um índice fora 
//dos limites permitidos para o acesso de elementos
import java.lang.IndexOutOfBoundsException;
//Importação de tratamento de Exceção
import java.util.InputMismatchException;
//Importação da classe de Armazenamento_de_Clientes aonde é armazenado informações de clientes
import Classes_de_Armazenamentos.Armazenamento_de_Clientes;
//Importação da classe de Armazenamento_de_Produtos aonde é armazenado informações de produtos
import Classes_de_Armazenamentos.Armazenamento_de_Produtos;
//Importação da classe de Armazenamento_de_Funcionarios aonde é armazenado informações de funcionarios
import Classes_de_Armazenamentos.Armazenamento_de_Funcionarios;
//importação da classe Produtos
import Class_Get_Set_Met.Produtos;
//Importação da biblioteca Date para chamar a data e hora
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        //Instanciamento da classe de armazenamento arraylist de Armazenamento de Clientes
        Armazenamento_de_Clientes listclin = new Armazenamento_de_Clientes();
        //Instanciamento da classe de armazenamento arraylist de Armazenamento de Produtos
        Armazenamento_de_Produtos lispro = new Armazenamento_de_Produtos();
        //Instanciamento da classe de armazenamento arraylist de Armazenamento de Funcionarios
        Armazenamento_de_Funcionarios lisfun = new Armazenamento_de_Funcionarios();
        //Instanciamento da importação Scanner
        Scanner leia = new Scanner(System.in);
        
        int menu=0, i, id;
        //VARIAVEL LOGICA PARA FAZER COM QUE O PROGRAMA PARE QUANDO FOR SOLICITADO NO MENU
        boolean rode = true;
        Funcionario fun = new Funcionario();
        
        while(rode){

        //Tratamento de exessão sendo aplicada        
        
        
        try{
        menus();
        menu = leia.nextInt();
        }catch(InputMismatchException e){
                    erro();
        }
        
        
        
        
        
            //Limpeza de Bofer
            leia.nextLine();
            //Opções do Menu sendo executada
            switch(menu){
            case 1:
                listagemdevenda();
                 for(int s = 0 ; s < lispro.CDP.size() ; s++){
                    System.out.println("["+s+"]" + " - " + lispro.CDP.get(s));
                }
                System.out.println("Informe a Posição do produto: ");
                Produtos p = lispro.CDP.get(leia.nextInt());
                System.out.println("Informe a quantidade de Produto que deseja comprar: ");
                int quanti = leia.nextInt();
                lisfun.c.add(fun);
                espaco();
                tracos();
                System.out.println("Valor Total da Compra: R$" + p.getValor() * quanti);
                tracos();
                
                System.out.println("Valor Atual com Desconto: R$" + p.desconto(p)*quanti);
                tracos();
                System.out.println("A comissão do funcionario será de: " + fun.comissao() * quanti + " R$");
                double w = fun.comissao() * quanti + fun.identi();
                leia.nextLine();
                System.out.println("Digite o CPF sem Pontos e sem Traços: ");
                String fcpf = leia.nextLine();
                
                for( i = 0 ; i < lisfun.c.size() ; i++){
                    Funcionario pegafuncionario = lisfun.c.get(i);
                if(fcpf.equals(Integer.toString(pegafuncionario.getCpf()))){
                        pegafuncionario.setSalario(pegafuncionario.getSalario()+w);
                       } 
                    }
                
                p.setTotal_mercadoria(p.getTotal_mercadoria()-quanti);
                if(p.getTotal_mercadoria() <= 10){
                    condicao();
                    tracos();
                }if(p.getTotal_mercadoria() == 0){
                    alert();
                }
                vendido();
                
                break;
                
            case 2:
                //Processo de Cadastro de Cliente
                cadastrandoclirente();
                System.out.println("Insira o seu primeiro nome: ");
                String nome = leia.nextLine();
                System.out.println("Insira seu sobrenome completo: ");
                String sobrenome = leia.nextLine();
                System.out.println("Informe sua Idade: ");
                int idade = leia.nextInt();
                leia = new Scanner(System.in);
                System.out.println("Informe seu cpf sem pontos e sem traços: ");
                String cpf = leia.nextLine();
                //Chamada de função para informar que foi cadastrado
                cadastradocomsucesso();
                //Instanciamento da classe Informacoes de Cliente
                Informacoes_de_Cliente classnome = new Informacoes_de_Cliente();
                classnome.setNome(nome);
                classnome.setSobrenome(sobrenome);
                classnome.setIdade(idade);
                classnome.setCpf(cpf);
                //Adcionando as informações no ArrayList de Clientes
                listclin.n.add(classnome);
                break;
                
                
            case 3:
                espaco();
                removepro();
                //chamo a variavel da instancia do arraylist e após chamo a variavel 
                //do arraylist que está no outro pacote e pego as informações solicitadas e listo 
                for( i = 0 ; i < listclin.n.size() ; i++){
                    Informacoes_de_Cliente pegacliente = listclin.n.get(i);
                    System.out.println("["+i+"]" + pegacliente.getCpf());
                }
                System.out.println("QUAL NUMERO DE CLIENTE VOCÊ DESEJA REMOVER?");
                id = leia.nextInt();
                if(id > 0){
                    erro2();
                }else{
                listclin.n.remove(id);
                }
                break;
                
                
            case 4:
                listarclientes();
                System.out.println(listclin.toString());
                tracos();
                break;
                
            case 5:
                
                System.out.println("===PROCURAR CLIENTE POR CPF====");
                System.out.println("Digite o CPF sem Pontos e sem Traços: ");
                cpf = leia.nextLine();
                
                for( i = 0 ; i < listclin.n.size() ; i++){
                    Informacoes_de_Cliente pegacliente = listclin.n.get(i);
                if(cpf.equals(pegacliente.getCpf())){
                        espaco();
                        estrela();
                        clienteencontrado();
                        System.out.println("Nome: " +pegacliente.getNome());
                        System.out.println("Sobrenome: " + pegacliente.getSobrenome());
                        System.out.println("Idade: "+pegacliente.getIdade());
                        System.out.println("CPF: " + pegacliente.getCpf());
                        estrela();
                        espaco();
                       } 
                    }
                break;
            case 6:
                cadastrandoproduto();
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
                    System.out.println("Informe a Função do Produto de Limpeza: ");
                    String funcao = leia.nextLine();
                    Limpeza limpeza = new Limpeza(funcao,nomep, fornecedor, total_mercadoria, valor);
                    lispro.CDP.add(limpeza);
                }
                break;
                
            case 7:
                listadetodosprodutos();
                for(Produtos pro : lispro.CDP){
                    System.out.println(pro);
                }
                tracos();
                break;
                
            case 8:
                espaco();
                removeproduto();
                try{
                    for( i = 0 ; i < lispro.CDP.size() ; i++){
                    Produtos removeproduto = lispro.CDP.get(i);
                    System.out.println("["+i+"]" + removeproduto.getNomep());
                }
                    System.out.println("QUAL NUMERO DE PRODUTO VOCÊ DESEJA REMOVER / 00 - Sair?");
                    id = leia.nextInt();
                    if(id >= 0){
                        lispro.CDP.remove(id);
                    }else if(id == 00){
                        rode = false;
                    }
                    
                }catch(InputMismatchException | IndexOutOfBoundsException a){
                        
                }
                
                break;
                
            case 9:
                cadastrafuncionario();
                System.out.println("Digite Seu Nome Completo: ");
                String nomef = leia.nextLine();
                System.out.println("Digite seu CPF Apenas Número sem caracteres: ");
                int cpff = leia.nextInt();
                System.out.println("Informe o Valor do Salario deste Funcionario: ");
                double salariof = leia.nextDouble();
                cadastradocomsucesso();
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(nomef);
                funcionario.setCpf(cpff);
                funcionario.setSalario(salariof);
                lisfun.c.add(funcionario);
                break;
            case 10:
                procurarfunc();
                System.out.println("Digite o CPF sem Pontos e sem Traços: ");
                cpf = leia.nextLine();
                
                for( i = 0 ; i < lisfun.c.size() ; i++){
                    Funcionario pegafuncionario = lisfun.c.get(i);
                if(cpf.equals(Integer.toString(pegafuncionario.getCpf()))){
                        espaco();
                        estrela();
                        funcenc();
                        System.out.println("Nome: " +pegafuncionario.getNome());
                        System.out.println("CPF: " + pegafuncionario.getCpf());
                        System.out.println("SALARIO: " + pegafuncionario.getSalario());
                        estrela();
                        espaco();
                       } 
                    }
                break;
            case 11:
                rode = false;
                break;
            default:
            }
        }
        tracos();
        sistemaencerrado();
        tracos();
    }
    
    
    public static void alert(){
        System.out.println("====O ESTOQUE ESGOTOU APÓS COMPRA, FAVOR REABASTEÇA====");
    }
    
    public static void condicao(){
        System.out.println("==========ATENÇÃO ESTOQUE IGUAL OU ABAIXO DE 10, FAVOR ABASTECER ESTOQUE==========");
    }
    
    public static void cadastrandoproduto(){
        System.out.println("==============CADASTRANDO PRODUTO===============");
    }
    public static void procurarfunc(){
        System.out.println("===PROCURAR FUNCIONARIO POR CPF====");
    }
    public static void funcenc(){
        System.out.println("====FUNCIONARIO ENCONTRADO NO SISTEMA====");
    }
    public static void removepro(){
        System.out.println("====REMOVER UM CLIENTE====");
    }
    public static void vendido(){
                System.out.println("============VENDIDO COM SUCESSO!!!============");
    }
    public static void listagemdevenda(){
        System.out.println("===============LISTA DE PRODUTOS===============");
    }
    public static void cadastrandoclirente(){
                System.out.println("==============CADASTRANDO CLIENTE=================");
    }
    public static void removeproduto(){
                System.out.println("====REMOVER UM PRODUTO====");
    }
    public static void tracos(){
                System.out.println("==============================================\n");
    }
    public static void listadetodosprodutos(){
                System.out.println("====LISTA DE TODOS OS PRODUTOS CADASTRADOS====");
    }
    public static void sistemaencerrado(){
                System.out.println("====SISTEMA ENCERRADO COM SUCESSO!!!====");
    }
    public static void cadastrafuncionario(){
                System.out.println("===========CADASTRANDO FUNCIONARIO===========");
    }
    
    public static void cadastradocomsucesso(){
                System.out.println("================================================");
                System.out.println("============CADASTRADO COM SUCESSO!=============");
                System.out.println("================================================\n\n");
    }
    public static void clienteencontrado(){
                System.out.println("======CLIENTE ECONTRADO NO SISTEMA=======");
    }
    public static void listarclientes(){
                System.out.println("====LISTA DE TODOS OS CLIENTES CADASTRADOS====");
    }
    public static void estrela(){
                System.out.println("******************************************************");
    }
    public static void erro(){
                    System.out.println("========ERRO DE ENTRADA=======");
                    System.out.println("******************************");
                    System.out.println("******************************");
                    System.out.println("NÃO   DIGITE   LETRAS   APENAS");
                    System.out.println("DIGITE   NÚMERO   PARA   PARA ");
                    System.out.println("UMA  DAS  OPÇÕES  ACIMA ! ! !!");
                    System.out.println("VALOR INVALIDO TENTE NOVAMENTE");
                    int me = 7;
                    System.out.println("******************************");
                    System.out.println("******************************");
    }
    public static void erro2(){
        System.out.println("NENHUM CLIENTE CADASTRADO OU POSIÇÃO INVALIDA");
    }
    public static void menus(){
        System.out.println("=======================INFORME UMA OPÇÃO====================");
        System.out.println("1  - Vender  " + "                       2  - Cadastrar Cliente");
        System.out.println("3  - Remover Cliente    " + "            4  - Listar Clientes");
        System.out.println("5  - Buscar Cliente Especifico   " + "   6  - Cadastrar Produtros");
        System.out.println("7  - Listar Produtos    " + "            8  - Remover Produto ");
        System.out.println("9  - Cadastrar Funcionario   " + "       10 - Buscar Funcionario");
        System.out.println("11 - Sair");
        System.out.println("============================================================");
    }
    public static void espaco(){
        System.out.println("\n \n \n");
    }
}
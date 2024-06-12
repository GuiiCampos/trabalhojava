import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciarFuncionarios gerenciador = new GerenciarFuncionarios();
        Scanner sc = new Scanner(System.in);

        //Repetição para o usuario poder escolher as opções
        while(true){
            System.out.println("\n1. Adicionar Empregado");
            System.out.println("2. Exibir Empregado por ID");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = sc.nextLine();

            //condicional que vai realizar alguma função dependendo do número que o usuário digitar
            switch (opcao) {
                case "1":
                    System.out.print("ID: ");
                    String identificador = sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = Integer.parseInt(sc.nextLine());
                    System.out.print("Alergias: ");
                    String alergias = sc.nextLine();
                    System.out.print("Problemas Médicos: ");
                    String problemasMedicos = sc.nextLine();
                    System.out.print("Telefone de Contato: ");
                    String telefoneContato = sc.nextLine();
                    System.out.print("E-mail de Contato: ");
                    String emailContato = sc.nextLine();
                    Empregados empregado = new Empregados(identificador, nome, idade, alergias, problemasMedicos, telefoneContato, emailContato);
                    gerenciador.adicionarEmpregado(empregado);
                    break;

                case "2":
                    System.out.printf("%nID do empregado: ");
                    String id = sc.nextLine();
                    gerenciador.exibirFuncionario(id);
                    break;

                case "3":
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
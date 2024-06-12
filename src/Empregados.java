import java.util.ArrayList;

public class Empregados {
    //Criando os atributos
    private String identificador;
    private String nome;
    private int idade;
    private String alergias;
    private String problemasMedicos;
    private String telefoneContato;
    private String emailContato;


    //Definindo o construtor
    public Empregados(String identificador, String nome, int idade, String alergias, String problemasMedicos, String telefoneContato, String emailContato) {
     this.identificador = identificador;
        this.nome = nome;

        //Criando uma regra para que não tenha menores de 18 e maiores de 59
        if (idade >= 18 && idade <= 60) {
            this.idade = idade;
        } else {
            //variavel para tingir a frase
            final String RED = "\033[0;31m";
            
            System.out.printf(RED + "%nidade invalida%n");
            if (idade <18){
                System.out.println(RED +"Você tem que ter mais de 18 anos");
            } else{
                System.out.println(RED +"Você deve ter menos de 60 anos");
            }
            System.exit(0);
        }

        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
        this.telefoneContato = telefoneContato;
        this.emailContato = emailContato;
    }

    public String getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "ID: " + identificador + "\n"
                + "Nome: " + nome + "\n"
                + "Idade: " + idade + "\n"
                + "Alergias: " + alergias + "\n"
                + "Problemas Médicos: " + problemasMedicos + "\n"
                + "Telefone de Contato: " + telefoneContato + "\n"
                + "E-mail de Contato: " + emailContato + "\n";
    }
}

//Classe para poder gerenciar os funcionarios
class GerenciarFuncionarios{

    ArrayList<Empregados> listaFuncionarios;

    //construtor da classe
    public GerenciarFuncionarios() {
        //inicializando a lista
        listaFuncionarios = new ArrayList();
    }

    //Função para adicionar um usuário a lista
    public void adicionarEmpregado(Empregados empregado) {
        listaFuncionarios.add(empregado);
    }

    //função para retorna todas as informações do usuários
    public Empregados encontrarFuncionarios(String identificador){
        for (Empregados empregados : listaFuncionarios) {
            if (empregados.getIdentificador().equals(identificador)) {
                return empregados;
            }
        }
        return null;
    }

    //função para exibir formatar a saida de dados
    public void exibirFuncionario(String identificador){
        Empregados empregado = encontrarFuncionarios(identificador);
        if (empregado != null) {
            System.out.println(empregado);
        } else{
            System.out.println("Empregado com ID " + identificador + " não encontrado.");
        }
    }
}


package cadastro;
import java.util.Scanner;

public class cadastroAlunos {
    private static final int NOME_I = 0;
    private static final int ENDEREÇO_I = 1;
    private static final int CURSO_I = 2;
    private static final String MENU = """
           Escolha uma das opções abaixo:
           [1] Cadastrar 
           [2] Listar 
           [3] Encerrar
            """;

    private static String[][] alunos = new String[20][4];

    public static void main(String[] args) {
        System.out.println("Cadastro de Aluno");
        var scanner = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println(MENU);
            menu = scanner.nextInt();

            if (menu == 1) cadastrar(scanner);
            if (menu == 2) listar();
        } while (menu != 3);

    }
    private static void cadastrar(Scanner scanner){
        System.out.println("ID:");
        int id = scanner.nextInt();

        System.out.println("Nome: ");
        alunos[id][NOME_I] = scanner.next();

        System.out.println("Endereço: ");
        alunos[id][ENDEREÇO_I] = scanner.next();

        System.out.println("Curso: ");
        alunos[id][CURSO_I] = scanner.next();

    }


    private static void listar(){
        for (String[] aluno: alunos){
            System.out.println(aluno[NOME_I] + " " +
                    aluno[ENDEREÇO_I] + " " +
                    aluno[CURSO_I]);
        }
    }
}


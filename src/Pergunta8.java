import java.util.Scanner;

public class Pergunta8 {
    public static void main(String[] args) {

        System.out.print("Insira seu nome: \n");

        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();

        int quantidade = nome.length();

        System.out.print(quantidade);

        nome=nome.toUpperCase();

        System.out.print("\n"+nome);

        String sobrenome = "SILVA";

        boolean possuisobrenome = sobrenome.contains("SILVA");

        System.out.print("\n"+possuisobrenome);
    }
}

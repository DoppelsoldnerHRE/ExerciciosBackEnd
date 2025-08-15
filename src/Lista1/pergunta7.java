package Lista1;

import java.util.Scanner;

public class pergunta7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira seu peso (kg): ");
        double peso = leitor.nextDouble();

        System.out.print("Insira sua altura (m): ");
        double altura = leitor.nextDouble();

        IMC(peso, altura);
    }

    static void IMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
    }
}

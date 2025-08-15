package Lista1;

import java.util.Scanner;

public class Pergunta5 {
    public  static void main(String[] args) {
        System.out.println("Insira a sua idade");

        int idade=0;

        Scanner ler = new Scanner(System.in);
        idade = ler.nextInt();

        if (idade<=12){
            System.out.println("Você e uma criança");
        }
        if (idade<=18 && idade>=12){
            System.out.println("Você e um adolecente");
        }
        if (idade>=18){
            System.out.println("Você e um adulto");
        }

    }
}

package Lista1;

import java.util.Scanner;

public class Pergunta4 {
    public static void main(String[] args) {
        Double arroz = 4.69;
        Double feijao= 7.13;
        Double pao = 2.0;
        Double cafe = 31.45;
        Double carro = 5.45;
        Double teclado = 75.80;
        Double mouse = 48.9;

        int opcao=1;
        Double valor= 0.0;

        while (opcao!=0){
            System.out.println("Digite 1 para feijão, 2 para arroz, 3 para pao, 4 para cafe, 5 para carro, 6 para teclado, 7 para mouse, e 0 para sair");

            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();

            if(opcao==1){
                valor+=arroz;
        }
            if(opcao==2){
                valor+=feijao;
            }
            if(opcao==3){
                valor+=pao;
            }
            if(opcao==4){
                valor+=cafe;
            }
            if(opcao==5){
                valor+=carro;
            }
            if(opcao==6){
                valor+=teclado;
            }
            if(opcao==7){
                valor+=mouse;
            }

    }
        if (valor>=100.0){
            valor=valor*0.9;
        }

        System.out.println(valor);
}



        }
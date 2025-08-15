package Lista1;

import java.util.Scanner;

public class Pergunta6 {
    public static void main(String[] args) {

        Double aluno1[]={7.0,8.3,9.5,5.6,8.8};
        Double aluno2[]={6.0,2.3,10.0,5.6,8.8};
        Double aluno3[]={9.0,8.3,9.5,5.6,8.8};
        Double aluno4[]={8.0,7.3,9.5,5.6,8.8};
        Double aluno5[]={4.0,9.3,9.5,5.6,8.8};

        Double notaaluno1=0.0;
        Double notaaluno2=0.0;
        Double notaaluno3=0.0;
        Double notaaluno4=0.0;
        Double notaaluno5=0.0;

        int alunoselecionado=0;
        Scanner ler = new Scanner(System.in);
        alunoselecionado=ler.nextInt();

       if(alunoselecionado==1){
            Double media1 = aluno1[0]+ aluno1[1] + aluno1[2] + aluno1[3] + aluno1[4];
            Double media2 = media1 / aluno1.length;
            System.out.println(media2);
        }
        if(alunoselecionado==2){
            Double media1 = aluno2[0]+ aluno2[1]+ aluno2[2]+ aluno2[3]+ aluno2[4];
            Double media2 = media1 / aluno1.length;
            System.out.println(media2);
        }
        if(alunoselecionado==3){
            Double media1 = aluno2[0] + aluno3[1]+ aluno3[2]+ aluno3[3]+ aluno3[4];
            Double media2 = media1 / aluno1.length;
            System.out.println(media2);
        }
        if(alunoselecionado==4){
            Double media1 = aluno4[0]+ aluno4[1]+ aluno4[2]+ aluno4[3]+ aluno4[4];
            Double media2 = media1 / aluno1.length;
            System.out.println(media2);
        }
        if(alunoselecionado==5){
            Double media1 = aluno5[0]+ aluno5[1]+aluno5[2]+ aluno5[3]+ aluno5[4];
            Double media2 = media1 / aluno1.length;
            System.out.println(media2);
        }



    }
}

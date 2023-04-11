package controle;

//quantidade indeterminada de alunos
/*Notas validadas 0 / 10
soma das notas
quantas notas validas foram digitadas
-1 sair do programa


 */

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota = 0, somaNota = 0, mediaNota=0;
        int i = 0;
        while(nota != -1){
            System.out.print("Entre com uma nota: ");
            nota = entrada.nextDouble();

            if(nota >= 0 && nota <= 10){
                i++;
                 somaNota=+ nota;
            }else if (nota != -1)
                System.out.println("Nota inválida! As notas válidas são entre 0 e 10.\n" +
                        "Para sair digite -1");
        }

        mediaNota = somaNota / i;

        System.out.print("Quantidade de notas validas: "+ i);
        System.out.print("\nA soma das notas foi de: "+  somaNota);
        System.out.print("\nA média das notas foi de: "+  mediaNota);


    }
}

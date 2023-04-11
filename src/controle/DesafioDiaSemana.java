package controle;

import javax.swing.*;
import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dia = JOptionPane.showInputDialog("Escreva o dia da semana");

//        System.out.println("Digite uma dia da semana: ");
//        int dia = entrada.nextInt();
//
//        if (dia < 1 || dia > 7){
//            System.out.println("Dia inválido");
//        } else if (dia == 1) {
//            System.out.println("Domingo");
//        } else if (dia == 2) {
//            System.out.println("Segunda");
//        } else if (dia == 3) {
//            System.out.println("Terça");
//        } else if (dia == 4) {
//            System.out.println("Quarta");
//        } else if (dia == 5) {
//            System.out.println("Quinta");
//        } else if (dia == 6) {
//            System.out.println("Sexta");
//        } else
//            System.out.println("Sábado");

   //     System.out.println("Escreva um dia da semana: ");
     //   String dia = entrada.next();

        if(dia.equalsIgnoreCase("domingo")){
            System.out.println(1);
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println(2);
        }else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
            System.out.println(3);
        }else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println(4);
        }else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println(5);
        }else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println(6);
        }else if (dia.equalsIgnoreCase("sábado")  || dia.equalsIgnoreCase("sabado")) {
            System.out.println(7);
        }else
            System.out.println("Escreva o dia da semana corretamente");


        entrada.close();
    }
}

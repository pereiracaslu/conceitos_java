package controle;

import javax.swing.*;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class If {
    public static void main(String[] args) {

        String nota = JOptionPane.showInputDialog("Média do aluno: ");
        double media = Double.parseDouble(nota);
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Média do aluno: ");
//        double media = entrada.nextDouble();

        if (media >= 7) {
            System.out.println("Aprovado");
            System.out.print("Parabéns");
        }
        if (media < 7) {
            System.out.println("Não foi aprovado");
            System.out.println("Recuperação nas férias");
        }

        boolean aprovadoParaFaculdade = media >=8.5 && media <=10;

        if(aprovadoParaFaculdade)
            System.out.println(" você foi selecionado para a faculdade!");

        //entrada.close();
    }
}

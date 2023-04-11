package controle;

import javax.swing.*;

public class IfElseIf {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Média do aluno: ");
        double media = Double.parseDouble(valor);

        if (media > 10 || media < 0) {
            System.out.println("Nota inválida");
        } else if (media >= 9) {
            System.out.println("Aprovado! Selecionado para faculdade");
        } else if (media >= 8) {
            System.out.println("Aprovado! Você está na lista de espera da faculdade");
        } else if (media >= 6 && media < 8) {
            System.out.println("Aluno aprovado.");
        } else if (media < 6) {
            System.out.println("Reprovado");
        }
    }
}

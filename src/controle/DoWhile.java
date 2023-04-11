package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.print("Fale: ");
            texto = entrada.nextLine();

        }while(!texto.equalsIgnoreCase("chega"));

        System.out.println("Você saiu!!");

        entrada.close();


    }
}

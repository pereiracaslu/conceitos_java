package controle;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//
//        int i = 0;
//
//        while (i < 10) {
//
//            System.out.println("Execute 10x");
//            i++;
//        }
        Scanner escreva = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {
            System.out.print("Vc diz: ");
            valor = escreva.next();

            if (!valor.equalsIgnoreCase("sair")) {
                System.out.println("Digite sair para parar");
            }

        }


        escreva.close();
    }
}

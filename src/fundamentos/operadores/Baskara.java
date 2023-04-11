package fundamentos.operadores;

import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor de A:");
        int a = entrada.nextInt();

        System.out.println("Valor de B:");
        int b = entrada.nextInt();

        System.out.println("Valor de C:");
        int c = entrada.nextInt();

        int delta = (b * b) - 4 * a * c;

        System.out.printf("Equação: %d*%d - 4 * %d * %d", b, b, a, c);
        System.out.println(delta);


        entrada.close();
    }
}

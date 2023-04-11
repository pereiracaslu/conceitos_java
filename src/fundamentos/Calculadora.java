package fundamentos;

import java.util.Scanner;

public class Calculadora {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a =   entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int b =   entrada.nextInt();

        System.out.println("Qual operação deseja realizar + - / * % ");
        System.out.print("Digite o simbolo: ");
        String operador = entrada.next();

        int c;
        if("+".equals(operador.trim())){
            c = a+b;
            System.out.println(c);
        }

        if("-".equals(operador.trim())){
            c = a-b;
            System.out.println(c);
        }

        if("*".equals(operador.trim())){
            c = a*b;
            System.out.println(c);
        }

        if("/".equals(operador.trim())){
            c = a/b;
            System.out.println(c);
        }

        if("%".equals(operador)){
            c = a%b;
            System.out.println(c);
        }

        entrada.close();
    }
}

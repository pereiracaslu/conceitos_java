package fundamentos;

import java.util.Scanner;
//O equals é utilizado na comparação da string de mesmo valor diferente do == que compara se o objeto é igual.
public class TipoStringEquals {
    public static void main (String[] args){
        System.out.println("2"=="2");

        String s = new String ("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));

        Scanner entrada = new Scanner(System.in);
        String s1 = entrada.next();

        System.out.println(s==s1);
        System.out.println(s.equals(s1.trim()));

    }
}

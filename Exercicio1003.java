import java.util.Scanner;

public class Exercicio1003{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int a;
        int b;
        int SOMA;

        a = teclado.nextInt();
        b = teclado.nextInt();

        SOMA = a + b;

        System.out.println("SOMA = " + SOMA);

    }
}
import java.util.Scanner;

public class Leitura{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int a;
        float b;
        double c;

        System.out.println("Digite um valor inteiro:");

        a = teclado.nextInt();

        System.out.println("Digite um valor float:");

        b = teclado.nextFloat();

        System.out.println("Digite um valor Double:");

        c = teclado.nextDouble();

        System.out.println("Você digitou "+ a + " " + b + " " + c);


    }
}
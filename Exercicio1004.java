    import java.util.Scanner;

public class Exercicio1004{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int a;
        int b;
        int PROD;

        a = teclado.nextInt();
        b = teclado.nextInt();

        PROD = a * b;

        System.out.println("PROD = " + PROD);

    }
}
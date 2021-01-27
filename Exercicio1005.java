import java.util.Scanner;

public class Exercicio1005{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double a;
        double b;
        double MEDIA;

        a = teclado.nextFloat();
        b = teclado.nextFloat();

        MEDIA = ((a * 3.5 ) + (b * 7.5 ))/11.0;

        System.out.printf("MEDIA = %.5f\n" , MEDIA);

    }
}
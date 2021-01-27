import java.util.Scanner;

public class Losango{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double diagonal1;
        double diagonal2;
        double area;

        System.out.println("Digite o valor da primeira diagonal do Losango:");

        diagonal1 = teclado.nextDouble();

        System.out.println("Digite o valor da segunda diagonal do Losango:");

        diagonal2 = teclado.nextDouble();

        area = diagonal1 * diagonal2;

        System.out.println("A area do losango e: " + area +" m2");


    }
}
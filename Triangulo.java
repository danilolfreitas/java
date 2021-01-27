import java.util.Scanner;

public class Triangulo{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double altura;
        double base;
        double area;

        System.out.println("Digite o valor da base do trianbulo:");

        base = teclado.nextDouble();

        System.out.println("Digite o valor da altura do triangulo:");

        altura = teclado.nextDouble();

        area = (base * altura) / (double)2;

        System.out.println("A area do triangulo e: " + area +" m2");

    }
}
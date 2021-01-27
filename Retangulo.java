import java.util.Scanner;

public class Retangulo{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double base;
        double altura;
        double area;


        System.out.println("Digite o valor da base do retangulo:");

        base = teclado.nextDouble();

        System.out.println("Digite o valor da altura do retangulo:");

        altura = teclado.nextDouble();

        area = base * altura;

        System.out.println("A area do retangulo e: " + area +" m2");


    }

}
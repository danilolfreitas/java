import java.util.Scanner;

public class Quadrado{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double lado;
        double area;

        System.out.println("Informe o lado do quadrado que deseja calcular a area:");
        lado = teclado.nextDouble();

        area = lado * lado;

        System.out.println("A area do quadrado e " +area +" m2");


    }

}
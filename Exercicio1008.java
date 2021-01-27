import java.util.Scanner;

public class Exercicio1008{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int funcionario;
        int horas;
        double valorPorHora;
        double salario;

        funcionario = teclado.nextInt();
        horas = teclado.nextInt();
        valorPorHora = teclado.nextDouble();

        salario = horas * valorPorHora;

        System.out.printf("NUMBER = %d\n" , funcionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }
}
import java.util.Scanner;

public class Exercicio1017{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int tempo;
        int velocidade;
        int distanciaTotal;
        double consumo;
        double qtdLitros;

        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();
        consumo = 12;

        distanciaTotal = tempo * velocidade;

        qtdLitros = distanciaTotal / consumo;

        System.out.printf("%.3f\n" , qtdLitros);

    }
}
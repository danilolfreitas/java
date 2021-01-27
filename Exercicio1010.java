import java.util.Scanner;

public class Exercicio1010{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int peca1;
        int qtdpeca1;
        double vlrpeca1;
        
        int peca2;
        int qtdpeca2;
        double vlrpeca2;

        double valorTotal;

        peca1 = teclado.nextInt();
        qtdpeca1 = teclado.nextInt();
        vlrpeca1 = teclado.nextDouble();

        peca2 = teclado.nextInt();
        qtdpeca2 = teclado.nextInt();
        vlrpeca2 = teclado.nextDouble();

        valorTotal = (qtdpeca1 * vlrpeca1) + (qtdpeca2 * vlrpeca2);

        System.out.printf("VALOR A PAGAR = R$ %.2f\n" , valorTotal);
        

    }
}
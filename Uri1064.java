import java.util.Scanner;

public class Uri1064{
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        float valor;
        float soma = 0;
        int qtd = 0;

        for (int cont = 1 ; cont <= 6 ; cont++){

            valor = teclado.nextFloat();

            if(valor > 0){
                qtd++;
                soma = soma + valor;
            }

        }

        System.out.println(qtd + " valores positivos");
        System.out.printf("%.1f\n", soma / qtd);

    }
    
}
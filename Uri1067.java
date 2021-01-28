import java.util.Scanner;


public class Uri1067{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int entrada = teclado.nextInt();

        for(int valor = 1; valor <=entrada ; valor++){

            if (valor %2 != 0){

            System.out.println(valor);

            }

        }

    }
}
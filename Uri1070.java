import java.util.Scanner;


public class Uri1070{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int X = teclado.nextInt();
        int contador = 1;

        while(contador <=6){

            if (X %2 != 0){

            System.out.println(X);
            contador++;
            X++;
            
            }else{

                X++;
            }

        }

    }
}
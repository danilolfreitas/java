import java.util.Scanner;


public class Uri1142{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int N = 1;
        int limite = teclado.nextInt();
        
        for(int contador = 1 ; contador <= limite ; contador++){

            System.out.println(N+" "+(N+1)+" "+(N+2)+" PUM");

            N+=4;

        }
       
        
    }
}
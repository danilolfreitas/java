import java.util.Scanner;


public class Uri1144{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int N = 1;
        int limite = teclado.nextInt();
        
        for(int contador = 1 ; contador <= limite ; contador++){

            System.out.println(N+" "+(N*N)+" "+(N*N*N));
            System.out.println(N+" "+(N*N+1)+" "+(N*N*N+1));

            N++;

        }
       
        
    }
}
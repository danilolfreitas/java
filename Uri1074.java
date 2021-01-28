import java.util.Scanner;


public class Uri1074{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int entrada = teclado.nextInt();
        int entrada2;

        for(int valor = 1; valor <=entrada ; valor++){

            entrada2 = teclado.nextInt();

            if(entrada2 == 0){

                System.out.println("NULL");    

            }else if(entrada2 % 2 ==0){

                System.out.print("EVEN");
            }else{
                System.out.print("ODD");
            }

            if (entrada2 >0){

                System.out.println(" POSITIVE");

            }else if (entrada2 <0){

                System.out.println(" NEGATIVE");

            }
            
            
        }

    }
}
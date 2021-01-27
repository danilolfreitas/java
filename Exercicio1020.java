import java.util.Scanner;

public class Exercicio1020{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int dias;
        int anos;
        int meses;
                
        dias = teclado.nextInt();

        anos = dias / 365;
        
        dias = dias - (anos * 365);

        meses = dias / 30;

        dias = dias - (meses * 30);

        System.out.printf("%d ano(s) \n" , anos);
        System.out.printf("%d mes(es) \n" , meses);
        System.out.printf("%d dia(s) \n" , dias);

    }
}
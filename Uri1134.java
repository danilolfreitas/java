import java.util.Scanner;


public class Uri1134{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int codigo;
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;
        Boolean nulo = false;

        while(nulo == false){

            codigo = teclado.nextInt();
            
            if(codigo >=1 && codigo <= 4){

                switch (codigo){
                    case 2:
                    gasolina++;
                    break;

                    case 1:
                    alcool++;
                    break;

                    case 3:
                    diesel++;
                    break;
                    case 4:
                    nulo = true;
                    break;
                }

            }

        }

        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
                
        
    }
}
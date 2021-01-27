import java.util.Scanner;

//([0,25], (25,50], (50,75], (75,100])

public class Exercicio1037{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double valor;
        String intervalo = "";
                        
        valor = teclado.nextDouble();

        if (valor >= 0 && valor <= 25){

            intervalo = "Intervalo [0,25]";

        }else if (valor > 25 && valor <=50){

            intervalo = "Intervalo (25,50]";

        }else if(valor > 50 && valor <= 75){

            intervalo = "Intervalo (50,75]";

        }else if (valor > 75 && valor <=100){

            intervalo = "Intervalo (75,100]";

        }else {

            intervalo = "Fora do intervalo";

        }

        System.out.println(intervalo);

    }

}
import java.util.Scanner;

public class Exercicio1048{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double salario;
        double reajuste = 0;
        double vlrReajuste = 0;
                
        salario = teclado.nextDouble();
                
        if (salario <= 400){
            reajuste = 0.15;
        }else if (salario <= 800) {
            reajuste = 0.12;
        }else if (salario <= 1200) {
            reajuste = 0.10;
        }else if (salario <= 2000) {
            reajuste = 0.07;
        }else{
            reajuste = 0.04;
        }

        vlrReajuste = reajuste * salario;
        salario = salario + vlrReajuste;

        System.out.printf("Novo salario: %.2f\n", salario);
        System.out.printf("Reajuste ganho: %.2f\n", vlrReajuste);
        System.out.printf("Em percentual: %.0f %%\n", (reajuste * 100));

    }
}
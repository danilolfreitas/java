import java.util.Scanner;

public class Exercicio1050{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int ddd;
        String cidade;
        
        ddd = teclado.nextInt();
        
        cidade = "DDD nao cadastrado";
        
        if (ddd == 11){
            cidade = "Sao Paulo";
        }else if(ddd == 61){
            cidade = "Brasilia";
        }else if(ddd == 71){
            cidade = "Salvador";
        }else if(ddd == 21){
            cidade = "Rio de Janeiro";
        }else if(ddd == 32){
            cidade = "Juiz de Fora";
        }else if(ddd == 19){
            cidade = "Campinas";
        }else if(ddd == 27){
            cidade = "Vitoria";
        }else if(ddd == 31){
            cidade = "Belo Horizonte";
        }

        System.out.println(cidade);

    }
}
import java.util.Scanner;


public class Uri1115{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int x;
        int y;
        Boolean nulo = false;
        String posicao = "";

        while(nulo == false){

            x = teclado.nextInt();
            y = teclado.nextInt();

            if(x == 0 || y == 0){

                nulo = true;

            }else{

                if(x > 0 && y < 0){
                    posicao = "quarto";
                    }else if(x > 0 && y > 0){
                        posicao = "primeiro";
                        }else if(x < 0 && y < 0){
                        posicao = "terceiro";
                        }else if(x < 0 && y > 0){
                        posicao = "segundo";
                }

                System.out.println(posicao);



            }

        }
                
        
    }
}
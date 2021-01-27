import java.util.Scanner;

public class Exercicio1041{
/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, 
ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem Origem.

Se o ponto estiver sobre um dos eixos escreva Eixo X ou Eixo Y, conforme for a situação.
*/
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        float x;
        float y;
        String posicao;
        
        x = teclado.nextFloat();
        y = teclado.nextFloat();
        
        posicao = "";
        
        if (x == 0 && y == 0){
            posicao = "Origem";
        }else if(x == 0 && y != 0){
            posicao = "Eixo Y";
        }else if(x != 0 && y == 0){
            posicao = "Eixo X";
        }else if(x > 0 && y < 0){
            posicao = "Q4";
        }else if(x > 0 && y > 0){
            posicao = "Q1";
        }else if(x < 0 && y < 0){
            posicao = "Q3";
        }else if(x < 0 && y > 0){
            posicao = "Q2";
        }

        System.out.println(posicao);

    }
}
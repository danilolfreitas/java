import java.util.Scanner;

public class Exercicio1052{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int mes;
        String mesExtenso;
        
        mes = teclado.nextInt();
        
        mesExtenso = "";
        
        if (mes == 1){
            mesExtenso = "January";
        }else if(mes == 2){
            mesExtenso = "February";
        }else if(mes == 3){
            mesExtenso = "March";
        }else if(mes == 4){
            mesExtenso = "April";
        }else if(mes == 5){
            mesExtenso = "May";
        }else if(mes == 6){
            mesExtenso = "June";
        }else if(mes == 7){
            mesExtenso = "July";
        }else if(mes == 8){
            mesExtenso = "August";
        }else if(mes == 9){
            mesExtenso = "September";
        }else if(mes == 10){
            mesExtenso = "October";
        }else if(mes == 11){
            mesExtenso = "November";
        }else if(mes == 12){
            mesExtenso = "December";
        }

        System.out.println(mesExtenso);


        

    }
}
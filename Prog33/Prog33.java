//Prog33 - Dias da semana
//Stefano Giordano - 27/03/2020
//Entrar com um numero de 1 a 7 e informar qual é o dia da semana

import java.util.*;
public class Prog33
{
    public static void main(String[] args)
    {
        int dia;
        String mens;
        
        System.out.println("Digite um numero de 1 a 7");
        Scanner sc = new Scanner(System.in);
        
        dia = sc.nextInt();
        
        if( dia == 1){
            mens = "1 equaivale a Domingo";
            System.out.println(mens);
        }else if (dia == 2){
            mens = "2 equivale a Segunda-feira";
            System.out.println(mens);
        }else if (dia == 3){
            mens = "3 equivale a Terça-feira";
            System.out.println(mens);
        }else if (dia == 4){
            mens = "4 equivale a Quarta-feira";
            System.out.println(mens);
        }else if (dia == 5){
            mens = "5 equivale a Quinta-feira";
            System.out.println(mens);
        }
        else if (dia == 6){
            mens = "6 equivale a Sexta-feira";
            System.out.println(mens);
        }else if (dia == 7){
            mens = "7 equivale a Sábado";
            System.out.println(mens);
        }else{
            mens = dia +" é um número inválido";
            System.out.println(mens);
        }
    }
}
        
        
        
        
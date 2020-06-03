//Prog31    Calculo de divisão de inteiros
//Stefano Giordano - 27/03/2020

//Entrar usando Scanner
//apresentar o resultado e o resto em linhas separadas
//indicar que não existe divisão por zero

import java.util.*;
public class Prog31
{
    public static void main(String[] args)
    {
        int Num, Div;
        
        System.out.println("Digite o dividendo: ");
        Scanner sc = new Scanner(System.in);
        Num = sc.nextInt();
        
        System.out.println("Digite o divisor: ");
        sc = new Scanner(System.in);
        Div = sc.nextInt();
        
        if( Div == 0){
            System.out.println("IMPOSSÍVEL DIVIDIR POR ZERO");
        }else{
            System.out.println("Resultado: " + Num/Div);
            System.out.println("Resto da divisão: " + Num%Div);
        }
    }
}

        
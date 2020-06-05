//Prog82 - Desdobramento de valor
//Stefano Giordano - 05/06/2020
//Entrar com um valor em R$
//arredondar os valores dos centavos,suprimindo-os
//Apresentar sua divisão em quantaide de notas nos valores 
//R$ 2 5 10 20 50  e 100 e moedas R$1,00 0,50 0,25 0,10 0,05 e 0,01
//reciclar o programa saindo quando digitar zero

import java.util.*;
public class Prog82
{
    public static void main(String args[])
    {
        float valor;
        int valint;
        do{
            System.out.println("\n\nDigite um valor R$ (0 para sair):");
            Scanner sc = new Scanner(System.in);
            try
            {
                valor = sc.nextFloat();
                //Areredonda numeros alem dos centavos
                valor = Math.round(valor*100);
                valor = valor/100;
            }
            catch( Exception e)
            {
                System.out.println("ERRO: Digite apeans numeros");
                continue; //como um "break" sem sair do loop;
            }
            if (valor <= 0)  //evita valores negativos
                break;
            System.out.println("Considera valor = "+valor);
            valint = (int)valor/100;
            if(valint > 0)
                System.out.println(valint +" notas de R$100,00");
            valor = valor%100;

            valint = (int)valor/50;
            if (valint > 0)
                System.out.println(valint + " notas de R$ 50,00");
            valor = valor%50;

            valint = (int)valor/20;
            if (valint > 0)
                System.out.println(valint + " notas de R$ 20,00");
            valor = valor%20;

            valint = (int)valor/10;
            if (valint > 0)
                System.out.println(valint + " notas de R$ 10,00");
            valor = valor%10;

            valint = (int)valor/5;
            if (valint > 0)
                System.out.println(valint + " notas de R$ 5,00");
            valor = valor%5;

            valint = (int)valor/2;
            if (valint > 0)
                System.out.println(valint + " notas de R$ 2,00");
            valor = valor%2;

            valint = (int)valor/1;
            if (valint > 0)
                System.out.println(valint + " moedas de R$ 1,00");
            valor = valor%1; //aqui, valor só tem os centavos

            valor = valor * 100;
            valint = (int) valor/50;
            if( valint > 0)
                System.out.println(valint + " moedas de R$ 0,50");
            valor = valor%50;

            valint = (int)valor/25;
            if( valint > 0)
                System.out.println(valint + " moedas de R$ 0,25");
            valor = valor%25;

            valint = (int) valor/10;
            if( valint > 0)
                System.out.println(valint + " moedas de R$ 0,10");
            valor = valor%10;

            valint = (int) valor/5;
            if( valint > 0)
                System.out.println(valint + " moedas de R$ 0,05");
            valor = valor%5;

            valor = Math.round(valor);
            valint = (int)valor;

            if(valint > 0)
                System.out.println(valint + " moedas de R$ 0,01");

        }
        while(true);
    }
}

 
 

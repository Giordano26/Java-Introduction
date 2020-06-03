//Prog26 - Geração de numeros aleatorios
//Stefano Giordano - 26/03/2020
//usar a class Math.random

import java.util.*;
public class Prog26
{
    public static void main(String[] args)
    {
        int n1,n2,n3,n4,n5,n6;
        String aposta;
        n1 = (int) (Math.random() *100);
        n2 = (int) (Math.random() *100);
        n3 = (int) (Math.random() *100);
        n4 = (int) (Math.random() *100);
        n5 = (int) (Math.random() *100);
        n6 = (int) (Math.random() *100);
        
        aposta = n1+ ", "+ n2 + ", "+n3+ ", "+n4+", "+n5+ ", "+n6;
        System.out.println("Os numeros da sorte ou azar são: ");
        System.out.println(aposta);
    }
}

       
        
        
        
         
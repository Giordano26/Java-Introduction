//Prog 11 - entrada de dados pelo teclado
//Stefano Giordano - 05/03/2020

import java.util.*;
public class Prog11
{
    public static void main(String[] args)
    {
        float a = 0 , b = 0 , Res = 0;
        System.out.println(" Digite a varivavel float a");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        
        System.out.println("Digite a varivael float b");
        sc = new Scanner(System.in);
        b = sc.nextFloat();
        
        Res = a + b;
        System.out.println( a + " + " + b+" = " + Res);
    }
}
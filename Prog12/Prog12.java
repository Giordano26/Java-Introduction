// Prog12 - As quatro operações  aritimeticas com numeros inteiros
// Stefano Giordano - 05/03/2020

import java.util.*;

public class Prog12
{ 
    public static void main(String[] args)
    {
        int N1 = 0 , N2 = 0, soma, sub, mult, div, rest;
        System.out.println("Digite o numero inteiro N1:  ");
        Scanner sc = new Scanner(System.in);
        N1 = sc.nextInt();
        
        System.out.println("Digite o numero inteiro N2:  ");
        sc = new Scanner(System.in);
        N2 = sc.nextInt();
        
        soma = N1 + N2;
        sub = N1 - N2;
        mult = N1 * N2;
        div = N1 / N2;
        rest = N1 % N2;
        
        System.out.println(N1+ " + " +N2+ " = " + soma);
        System.out.println(N1+ " - " +N2+ " = " + sub);
        System.out.println(N1+ " * " +N2+ " = " + mult);
        System.out.println(N1+ " / " +N2+ " = " + div);
        System.out.println(N1+ " % " +N2+ " = " + rest);
    }
}

        
         
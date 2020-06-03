
// Prog13 - As quatro operações  aritimeticas com numeros ponto flutuante
// Stefano Giordano - 05/03/2020

import java.util.*;

public class Prog13
{ 
    public static void main(String[] args)
    {
        float F1 = 0 , F2 = 0, soma, sub, mult, div;
        System.out.println("Digite o numero pt.flutuante F1:  ");
        Scanner sc = new Scanner(System.in);
        F1 = sc.nextFloat();
        
        System.out.println("Digite o numero pt.flutuante F2:  ");
        sc = new Scanner(System.in);
        F2 = sc.nextFloat();
        
        soma = F1 + F2;
        sub = F1 - F2;
        mult = F1 * F2;
        div = F1 / F2;
        
        
        System.out.println(F1+ " + " +F2+ " = " + soma);
        System.out.println(F1+ " - " +F2+ " = " + sub);
        System.out.println(F1+ " * " +F2+ " = " + mult);
        System.out.println(F1+ " / " +F2+ " = " + div);
    }
}
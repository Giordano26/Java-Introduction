//Prog27 - Calculo da hipotenusa
//Eli - 26/03/2020

import java.util.*;
public class Prog27
{
    public static void main(String[] args)
    {
        double cateto1, cateto2, hipotenusa;
        System.out.println("Digite a medida do cateto 1: ");
        Scanner sc = new Scanner(System.in);
        cateto1 = sc.nextFloat();
        
        System.out.println("Digite a medida do cateto 2: ");
        sc = new Scanner(System.in);
        cateto2 = sc.nextFloat();
        
        hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        
        System.out.printf("Hipotenusa = %.2f", hipotenusa);
    }
}

        
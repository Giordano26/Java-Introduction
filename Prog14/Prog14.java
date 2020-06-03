//Prog14 - Edição de valor em ponto-flutuante
//Stefano Giordano - 06/03/2020

import java.util.*;

public class Prog14
{
    public static void main(String[] args)
    {
        float Valor;
        System.out.println("Digite um valor ponto-flutuante:  ");
        Scanner val = new Scanner(System.in);
        Valor = val.nextFloat();
        
        System.out.println("Valor digitado:  " + Valor);
        
        System.out.printf("Valor digitado editado:  %8.2f\n" , Valor);
        System.out.printf("Valor digitado editado:  %1.4f\n" , Valor);
        System.out.printf("Valor digitado editado:  %8.0f\n" , Valor);
        System.out.printf("Valor digitado editado:  %8.4f\n"  , Valor);
        System.out.printf("Valor digitado editado:  %8.1f\n"  , Valor);
    }
}
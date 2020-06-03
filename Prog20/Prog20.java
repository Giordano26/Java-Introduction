//Prog20 - Calculo da Pontenciação
//Stefano Giordano - 13/03/2020
//usar a classe Math.pow --> Math.pow(base,potencia)

import java.util.*;
public class Prog20
{
    public static void main(String[] args)
    {
        float base, pot;
        double resultado;
        
        System.out.println("Digite um numero qualquer como base: ");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        
        System.out.println("Dgitie a pontencia: ");
        pot = sc.nextFloat();
        
        resultado = Math.pow(base,pot);
        
        System.out.println(base+ " elevado a potencia " + pot + " = "+ resultado);
    }
}

       
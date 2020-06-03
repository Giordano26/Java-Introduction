//Prog45 - 
//Stefano Giordano - 13/04/2020
// Reciclar o programa e sair quando o numero digitador for zero

import java.util.*;
public class Prog45
{
    public static void main(String[] args)
    {
        int n = 9; //qualquer numero diferente de zero
        
        do
        {
            System.out.println("Digite um numero inteiro (0 para sair):");
            Scanner sc =  new Scanner(System.in);
            
            System.out.println("quadrado = "+ (n*n) + " cubo = "+(n*n*n));
        }while ( n != 0);
        
        System.out.println("Saida solicitada");
    }
}


            
//Prog50 - Apresentar qualquer tabuada  de 0 a 20
//Entrar com um numero inteiro e mostrar a sua tabuada de 0 a 20
//Reciclar, saindo somente se for digitado sair

import java.util.*;
public class Prog50
{
    public static void main(String[] args)
    {
        int t, n;
        String xdig;
        
        do
        {
            System.out.println("Digite um numero inteiro ou 'sair'");
            Scanner sc = new Scanner(System.in);
            xdig = sc.nextLine();
            
            if (xdig.equals("sair"))
            {
                System.out.println("Saida solicitada");
                System.exit(1);
            }
            
            t = Integer.parseInt(xdig);
            
            for(n = 0; n <= 20; n++)
             System.out.println(t + " x " + n + " = " + t*n);
            } while( xdig != "sair");
        }
    }
    
            
            
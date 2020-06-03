//Prog58 - Encontrar um numero primo
//Stefano Giordano - 30/04/2020
//Apresentar o primeiro numero primo a partir de um numero qualquer informado
//reciclar o programa saindo se o numero informado for zero

import java.util.*;
public class Prog58
{
    public static void main(String[] args)
    {
        int N, m;
        
        do
        {
            
        System.out.println("Numero inicial (0 = sai): ");
        Scanner sc = new Scanner (System.in);
        N = sc.nextInt();
        
        if(N == 0)
            break;
        
        do
        {
            for(m = 2; m < N;m++)
            {
                if (N % m == 0)
                    break;
                }
            if ( m == N)
                break;
            
            N++;
        
        } while ( N != m);
        System.out.println("O proximo numero Primo é " + N);
    }while (N != 0);
    }
}



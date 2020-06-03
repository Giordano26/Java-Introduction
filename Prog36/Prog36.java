//Prog 36 - Teste de divisibilidade 
//Stefano Giordano - 02/04/2020
//Entrar com 2 numeros inteiros e verificar se um deles é divisivel pelo outro

import java.util.*;
public class Prog36
{
    public static void main(String[] args)
    {
        int n1, n2;
        System.out.println("Digite o primeiro numero inteiro: ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        
        System.out.println("Digite o segundo  numero inteiro: ");
        sc = new Scanner(System.in);
        n2 = sc.nextInt();
        
        if(n1%n2 == 0)
        { System.out.println(n1 + " é divisivivel por "+n2);
        }else if ( n2%n1 == 0)
        { System.out.println(n2 + " é divisivel por "+n1);
        }else
            System.out.println("Não há divisibilidade entre " + n1+ " e "+n2);
            
        }
    }
    
        
        
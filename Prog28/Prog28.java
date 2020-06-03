//Prog28 - Estrutura condicional
//Stefano Giordano - 26/03/2020

//Entrar com um numero inteiro e dizer se e par ou impar

import java.util.*;
public class Prog28
{
    public static void main(String[] args)
    {
        int num ;
        
        System.out.println("Digite um numero inteiro:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        //Testa se o resta da divisão por 2 é zero
        // operador "==" para if significa "="
        if (num % 2 == 0){
            System.out.println(num + " é Par");
        }else{
            System.out.println(num + " é Impar");
        }
    }
}

        
        
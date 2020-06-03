//Prog32 - verificação de produto
//Stefano Giordano

//Entrar com 3 numeros inteiros e dizer se o maior é produto dos outros dois
//Caso contrario informar: nada a declarar
//Usar o Scanner

import java.util.*;

public class Prog32
{
    public static void main(String[] args)
    {
        int a,b,c;
        
        System.out.println("Digite o primeiro número");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        System.out.println("Digite o segundo número");
        sc = new Scanner(System.in);
        b = sc.nextInt();
        
        System.out.println("Digite o terceiro número");
        sc = new Scanner(System.in);
        c = sc.nextInt();
        
        if((a>=b) && (a>=c) && (b*c == a)){
            System.out.println(a + " é o maior numero e "+b+"*"+c+" resultam em "+a);
        }else if((b>=a) && (b>=c) && (a*c == b)){
            System.out.println(b + " é o maior numero e "+a+"*"+c+" resultam em "+b);
        }else if ((c>=a) && (c>=b) && (b*a == c)){
            System.out.println(c + " é o maior numero e "+b+"*"+a+" resultam em "+c);
        }else{
            System.out.println("Nada a declarar");
        }
    }
}

            
        
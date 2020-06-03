//Prog18 - Teste com resto de divisao
//Stefano Giordano - 13/03/2020
//Entrar com 2 numeros inteiros A e B
//Calcular A/B e seu resto
//Calcular B/A e seu resto
//Acusar qualquer erro que for cometido
//(Se não for digitado um numero inteiro ou se tentar dividir por zero)


import java.util.*;
public class Prog18
{ 
    public static void main(String[] args)
    {
        int A , B ;
        try
        {
            System.out.println("Digite A (inteiro): ");
            Scanner sc = new Scanner(System.in);
            
            A = sc.nextInt();
            
            System.out.println("Digite B (inteiro): ");
            
            B = sc.nextInt();
            
            System.out.println( A + "/" + B + "= " +(A/B)+"          resto = "+ (A%B));
            System.out.println( B + "/" + A + "= " +(B/A)+"          resto = "+ (B%A));
        } catch (Exception erro)
        {
            System.out.println("ERRO DE DIGITAÇÃO");
            System.out.println("Erro padrão: " + erro.toString());
        }
    }
}

          
        
    
    
            
//Prog19 - Calculo da raiz quadrada
//Stefano Giordano - 13/03/2020
//Usar a classe Math.sqrt

import java.util.*;
public class Prog19
{
    public static void main(String[] args)
    {
       
        float numero;
        double raiz;
        try
        {
        System.out.println("Digite um numero qualquer!: ");
        Scanner sc = new Scanner(System.in);
        
        numero = sc.nextFloat();
        
        raiz = Math.sqrt(numero);
        
        System.out.println("Raiz quadrada de " +numero+ " = " +raiz);
    } catch (Exception erro)
    {
        System.out.println("ERRO DE DIGITAÇÃO");
        System.out.println("Erro padrão: " + erro.toString());
    }
}
}

        
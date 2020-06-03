//Prog15 - capturando erros de digitação
//Stefano Giordano - 06/03/2020

import java.util.*;

public class Prog15
{
    public static void main(String[] args)
    {
        float A;
        System.out.println("Digite um numero real:  ");
        Scanner sc = new Scanner(System.in);
        try
        {
            A = sc.nextFloat();
            System.out.println("Numero digitado:  " + A);
        }
        catch (Exception erro)
        {
            System.out.println("ERRO DE DIGITAÇÃO");
            System.out.println("Erro padrão:  "+erro.toString());
        }
    }
    }
        
//Prog79 - Estatistica de um jogo de dado
//Stefano Giordano - 29/05/2020
//Solicitar  uma quantidade de lançamentos de um dado
//Mostrar qual a frequencia de cada resultado
//reciclar o programa

import java.util.*;
public class Prog79
{
    public static void main(String args[])
    {
        int qtdlanc, nface;
        int [] frequencia = new int[7];
        do
        {
            System.out.println("Quantidade de lançamentos (0 para sair): ");
            Scanner sc = new Scanner(System.in);
            qtdlanc = sc.nextInt();
            if (qtdlanc <= 0)
                break;
                
            //zera os contadores
            
            for(int i = 0; i < 6; i++)
                frequencia[i+1] = 0;
            
            //lançamento do dado
            for(int i = 0; i< qtdlanc; i++)
            {
                do
                {
                    nface = 1 + (int) (Math.random() * 10);
                }
                while (nface < 1 || nface > 6);
                
                frequencia[nface] = frequencia[nface] + 1;
            }
            
            //apresentação do resultado
            System.out.println("Face \t Frequencia");
            for(int i = 0; i < 6; i++)
                System.out.printf("%d\t%d\n", i+1 , frequencia [i+1]);
            }
            while(true);
        }
    }
    
            
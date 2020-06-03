//Prog63 - Array bidimensional
//Stefano Giordano 08/05/2020

import java.util.*;
public class Prog63
{
    public static void main(String[] args)
    {
        
        int [][] matriz = new int [2][3]; //2 linhas e 3 colunas
        
        matriz[0][0] = 1;   matriz[0][1] = 2;   matriz[0][2] = 3;
        matriz[1][0] = 10;   matriz[1][1] = 20;   matriz[1][2] = 30;
        int soma = 0;
        
        for(int linha = 0; linha < 2; linha++)
            for(int coluna = 0; coluna < 3 ; coluna++)
                {
                 System.out.println(matriz[linha][coluna]);
                 soma = soma + matriz[linha][coluna];
                }
        
        System.out.println("Soma dos elementos da matriz = " +soma);
        for(int linha = 0; linha < 2; linha++)
            if(linha == 0){
                for(int coluna = 0; coluna < 3; coluna++)
                 {
                   System.out.print(matriz[linha][coluna]+"\t"); //tabulação
                }
                System.out.printf("\n");
            }else if (linha == 1){
                for(int coluna = 0; coluna < 3; coluna++)
                    System.out.print(matriz[linha][coluna]+"\t"); //tabulação
                System.out.printf("\n");
            }
        }
    }
    
 
    
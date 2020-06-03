//Prog64 - Array bidimensional com numeros aleatorios
//Stefano Giordano - 08/05/2020
//Definir um array bidimensional 30x12 com numeros aleatorios

import java.util.*;
public class Prog64
{
    public static void main(String[] args)
    {
        
        int [][] matriz = new int [30][12]; //30 linhas e 12 colunas
        
        for(int linha = 0; linha < 30; linha++)
            for(int coluna = 0; coluna < 12 ; coluna++)
                matriz[linha][coluna] = (int) (Math.random()*100);
        
        for (int lin = 0; lin < 30; lin++)
        {
            for (int col = 0; col < 12; col++)
                System.out.print(matriz[lin][col]+"\t");
                
            System.out.printf("\n");
        }
    }
}


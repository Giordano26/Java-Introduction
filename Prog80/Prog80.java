//Stefano Giordano - 29/05/2020
//Gerar um array bidimensional (l linhas e x C colunas) L = 50 e c =20
//Contendo 1000 numeros inteiros positivos e nao zerados, gerados aleatoriamente
//Solicitar um numero qualquaer, pesquisar no array
//mostrar todas as posições (linha,coluna) em que ele se encontra.
//caso contrario avisar que o numero nao consta
//reciclar a pesquisa saida ao digitar zero

import java.util.*;
public class Prog80
{
    public static void main(String args[])
    {
        int L = 50, C = 20;  //qtde de elemtnos do array
        int[][] Tabela = new int [L][C];  //array com 1000 elementos
        int lin = 0, col = 0;
        
        //populando o array
        for(lin = 0; lin < L; lin++)
            for(col = 0; col < C; col++)
                Tabela[lin][col] = (int) (Math.random() *1000) + 1; //+1 pra evitar o 0
        
        //Apresenta o Array
        for (lin = 0; lin < L; lin++)
        {
            for(col = 0; col < C; col++)
                System.out.printf("%d\t", Tabela [lin][col]);
            System.out.printf("\n");
        }
        
        //pesquisa
        do
        {
            int npesq = 0;
            System.out.println("\n Digite um numero qualquer (0 para sair)");
            Scanner sc = new Scanner(System.in);
            npesq = sc.nextInt();
            if (npesq == 0)
                break;
            
            //pesquisa
            
            boolean achou = false; //sentinela
            for (lin = 0; lin < L; lin++)
                for(col = 0; col < C; col++)
                {
                    if (Tabela[lin][col] == npesq)
                        {
                            System.out.println("O numero " + npesq + " encontra-se na posição ("+lin+","+col+")");
                            achou = true;
                        }
                }
            if (achou == false)
                        System.out.println("O numero "+ npesq +" NÃO CONSTA");
            }
                while(true);
            }
        }
        
                    
        
                
                
         
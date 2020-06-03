//Prog65 - Array Tridimensional com numeros aleatorios
//Stefano Giordano - 08/05/2020
//Definir um array tridimensional 8x5x3 com numeros aleatorios
//Apresentar 3 matriz conforme varia a terceira dimensao

import java.util.*;
public class Prog65
{
    public static void main(String[] args)
    {
        
        int [][][] cubo = new int [8][5][3]; //3 eixos: x, y, z
        
        for(int x = 0; x < 8; x++)
            for(int y = 0; y < 5; y++)
                for(int z = 0; z < 3; z++)
                    cubo [x][y][z] = (int) (Math.random()*100);
                    
        
        for( int z = 0; z < 3; z++)
            {
                for (int x = 0; x < 8; x++)
                {
                    for (int y=0; y<5;y++)
                        System.out.print(cubo[x][y][z]+ "\t");
                    System.out.printf("\n");
                }
                System.out.printf("\n");
            }
            
        }
    }
    
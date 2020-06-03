//Prog61 - Array unidimensional
//Stefano Giordano - 07/05/2020
//Gerar um array com 20 numeros aleatorios

import java.util.*;
public class Prog61
{
    public static void main(String[] args)
    {
        //define um array contendo 20 numeros inteiros
        int [] numeros = new int [20];
        for (int i = 0; i < 20; i++)
        {
            numeros[i] = (int) (Math.random() * 100);
            System.out.println(numeros[i]);
        }
        
        //apresentar o array numa linha horizontal
        for (int i = 0; i < 20; i++)
        System.out.printf("%d    ",numeros[i]);
        System.out.printf("\n");
        
         //ordernar os numeros do array
        Arrays.sort(numeros);
        //apresentar o array numa linha horizontal
        for (int i = 0; i < 20; i++)
        System.out.printf("%d    ",numeros[i]);
        System.out.printf("\n");
    }
}

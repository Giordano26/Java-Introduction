//Prog73 - Metodo com array e Sobrecarga - ordenação 
//Stefano Giordano - 22/05/2020
//Criar 2 metodos com mesmo nome: ordenaArray
//Um deles ordena strings e outro numeros inteiros

import java.util.*;
public class Prog73
{
    public static void main(String args[])
    {
        //define 2 arrays com dados pre definidos
        String[] nomes = {"João","Antonio","Matheus","Julia","Caio","Ricardo","Gabriel"};
        int [] numeros = {673,56,7,40,15,789,22,982,5,33,15};
        //comanda a ordenação usando o metodo ordenaArray
        String[] nomesOrd = ordenaArray(nomes);
        int[] numerosOrd = ordenaArray(numeros);
        //apresenta os arrays ordenados
        for(int i = 0; i < nomesOrd.length; i++)
            System.out.print(nomesOrd[i]+"  ");
            System.out.print("\n");
        for(int i = 0; i < numerosOrd.length; i++)
            System.out.print(numerosOrd[i]+ "  ");
            System.out.print("\n");
        }
        
    public static int [] ordenaArray (int [] n)
    {
        Arrays.sort(n);
        return(n);
    }
    
    public static String[] ordenaArray (String [] n)
    {
        Arrays.sort(n);
        return(n);
    }
}

    
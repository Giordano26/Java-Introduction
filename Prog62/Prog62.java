//Prog62 - Array unidimensional com Strings
//Stefano Giordano - 08/05/2020
//Gerar um array com strings pre-definidos e apresentar cada item verticalmente
//Ordernar os intesn e apresenta-los na horizontal

import java.util.*;
public class Prog62
{
    public static void main(String[] args)
    {
        
        String [] semana = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sabado"};
        
        for(int i=0; i < semana.length; i++)
            System.out.println(semana[i]);
            
            Arrays.sort(semana);
        for(int i=0; i < semana.length; i++)
            System.out.printf(semana[i]+" ");
        System.out.printf("\n");
         
    }
}

        
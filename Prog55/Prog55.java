//Prog55 - Investimento financeiro
//Stefano Giordano - 20/04/2020
//Calcular quantos anos são necessários para dobrar um investimento;
//Informar o valor investido e a taxa anual de rendimento (%)
//reciclar o programa saindo com o valor aplicado zero

import java.util.*;

public class Prog55
{
    public static void main(String[] args)
    {
        int anos;
        double valAplic, valFinal, renda;
        float taxa;
        
        do
        {
            System.out.println("Valor aplicado (0=sair): ");
            Scanner sc = new Scanner(System.in);
            valAplic = sc.nextDouble();
            
            if (valAplic == 0)
                break;
                
            System.out.println("Taxa anual (%): ");
            sc = new Scanner(System.in);
            taxa = sc.nextFloat();
            
            
            anos = 0;
            valFinal = valAplic;
            
            while (valFinal < valAplic * 2)
            {
                anos++;
                renda = valFinal * taxa/100;
                valFinal = valFinal + renda;
            }
            
            System.out.printf("Valor final = %8.2f após %d anos \n", valFinal, anos);
            
        } while( valAplic != 0);
    }
}

        
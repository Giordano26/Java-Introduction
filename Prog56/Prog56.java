//Prog56 - Investimento finaneceiro II
//Stefano Giordano - 30/04/2020
//Calcular o valor final de um investimento financeiro
//informar o valor investido e a taxa anual de rendimento (%)
//informar o tempo em anos 
//reciclar o programa saido com valor aplicado zero

import java.util.*;
public class Prog56
{
    public static void main(String[] args)
    {
        int anos, totAnos;
        double valAplic, valFinal, renda;
        float taxa;
        
        do
        {
        
        System.out.println("Valor aplicado (0=sair): ");
        Scanner sc = new Scanner(System.in);
        valAplic = sc.nextDouble();
        
        if(valAplic == 0)
            break;
            
        System.out.println("Taxa anual (%): ");
        sc = new Scanner(System.in);
        taxa = sc.nextInt();
        
        System.out.println("Qtd. de anos: ");
        sc = new Scanner(System.in);
        totAnos = sc.nextInt();
        
        
        anos = 0;
        valFinal = valAplic;
        while(anos < totAnos)
        {
            anos++;
            renda = valFinal * taxa/100;
            valFinal = valFinal + renda;
        }
        System.out.printf("Valor final = %8.2f após %d anos \n",valFinal, anos);
    } while(valAplic != 0);
}
}

    
//ProgPesquisa - Pesquisa Populacional
//Stefano Giordano 28/05/2020

import javax.swing.*;
import java.text.*;

public class ProgPesquisa
{
    public static void main(String args[])
    {
      //Criação de modelo para utilização futura
      DecimalFormat df = new DecimalFormat();
      df.applyPattern("###,##0.00");
      //fim da criação

     //declaração de contadores e termos
     int semanaI = 0;
     int popInI = 0;
     int popFinal = 0;
     int semanCont = 1;
     
     

     //Abertura do painel gráfico 
     do
     {
     String semana = JOptionPane.showInputDialog("Digite a quantidade de semanas desejada: ");
     String popIn = JOptionPane.showInputDialog("Digite a população inicial de baratas");
     if(semana.equals("EXIT"))
        System.exit(0);
      //Inicio da conversão
     try
     {
         semanaI = Integer.parseInt(semana);
         popInI = Integer.parseInt(popIn);
         
         if (semanaI <= 0 || popInI <= 0)
            JOptionPane.showMessageDialog(null, "Digite um numero válido", "ERRO", JOptionPane.WARNING_MESSAGE);
         else
         break;
         
     }
     catch (Exception erro)
     {
         JOptionPane.showMessageDialog(null, "Digite apenas números", "ERRO", JOptionPane.WARNING_MESSAGE);
     }
     }while(true);
     // fim da conversão

     //Primero passo fora do loop
     popFinal = passaSemana(popInI);
     popFinal = pulveriza(popFinal);
     float vf = popFinal;
     float vi = popInI;
     float percent = ((vf/vi)-1)*100;
     //formatação do float
     String percentF = df.format(percent);
     
     apresentaQtd(semanCont, popFinal, percentF);

     //loop para as outras semanas
     for(int i = 2; i <= semanaI; i++)
     {

       popFinal = passaSemana(popFinal);
       popFinal = pulveriza(popFinal);
       vf = popFinal;
       percent = ((vf/vi)-1)*100;
       percentF = df.format(percent);
       semanCont++;
       apresentaQtd(semanCont, popFinal, percentF);

     }

        

    }
   
   
    //Criação do método sem retorno para apresentar quantidades
    public static void apresentaQtd (int semana, int nBaratas, String nPorcentagem)
    {
      JOptionPane.showMessageDialog(null, "Quantidade de baratas: " + nBaratas,"Semana "+semana ,JOptionPane.INFORMATION_MESSAGE );
      JOptionPane.showMessageDialog(null, "Porcentagem de crescimento: " + nPorcentagem + "%","Semana "+semana ,JOptionPane.INFORMATION_MESSAGE );

    }
    
    //Criação do metodo com retorno para considerar a passagem de uma semana
    public static int passaSemana(int nBaratas)
    {
       nBaratas = nBaratas * 2;
       return nBaratas ; 
    }

    //Criação do metodo com retorno para o calculo de uma pulverização 
    public static int pulveriza (int nBaratas)
    {
        double nPopAtual =  (nBaratas - (nBaratas * (0.20)));
        int nPopAtualI = (int) nPopAtual; // Conversão para int pois não existe "meia" barata
        
        
        return(nPopAtualI); 
    }
}

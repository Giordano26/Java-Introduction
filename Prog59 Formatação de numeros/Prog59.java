//Prog59 - Exemplos de foramtação de numeros
//Stefano Giordano - 07/05/2020

import java.text.*; //ou java.text.DecimalFormat;

public class Prog59
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat();
        
        short idade = 31;
        df.applyPattern("000"); // 0 -> inclui zeros à esquerda
        System.out.println("idade: " + df.format(idade)+ " anos");
        
        int qtd = 4589;
        df.applyPattern("##0,000"); // # -> despreza zeros a esquerda
        System.out.println("qtd: "+ df.format(qtd)+ " pessoas");
        
        long estoque = 9830001;
        df.applyPattern("#,###,##0,000"); //numero inteiro longo
        System.out.println("estoque = " + df.format(estoque) + " peças");
        
        float altura = 23.78f;
        df.applyPattern("#0.00");  //2 casa decimais
        System.out.println("altura = "+ df.format(altura) + " metros");
        
        double peso = 450.3027;
        df.applyPattern("#0.0000"); //4 casas decimais
        System.out.println("peso = " + df.format(peso)+ " kg");
        
        String valor = "4458963.83"; //2 casas deciamais
        double valord = Double.parseDouble(valor);  //ncessaria a conversão para double
        df.applyPattern("R$ ###,###,##0.00");
        System.out.println("valor = "+df.format(valord));
    }
}

        
        
        
        
       
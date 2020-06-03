//Prog52 - Tabela d temperaturas graus Fahrenheit
//Stefano Giordano - 23/04/2020
//Apresentar a tabela de graus Fahrenheit de 0 a 300 de 10 em 10 
//Apresentar o correspondente grau celsius 
//Usar a formula C =((F - 32) * 5) / 9
//Apresentar as temperaturas com 2 casas decimais

public class Prog52
{
    public static void main(String [] args)
    {
        float graus;
        
        System.out.println("Fahrenh.  Celsius");
        System.out.println("--------  --------");
        
        for(float i = 0; i <= 300; i = i+10){
            graus = ((i - 32) * 5 ) / 9 ;
            System.out.printf("%6.2f\t%6.2f\n",i,graus);
        }
    }
}

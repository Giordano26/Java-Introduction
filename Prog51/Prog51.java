//Prog51 - Tabela de temperaturas Graus Celsius
//Stefano Giordano - 23/04/2020
//Apresentar a tabela de graus Celsius de 0 a 300 de 10 em 10
//Apresentar o correspodente grau Fahrenheit
//Usar a formula: F = ((C*9) / 5) + 32
//usar numero inteiros

public class Prog51 
{
    public static void main(String[] args)
    {
       int graus;
       
       System.out.println("Celsius  Fahrenheit");
       System.out.println("-------- -----------");
       for(int i = 0 ; i <= 300; i= i+10){
           graus = ((i *9) /5) + 32;
           System.out.println(i+"\t"+graus);
        }
    }
}

       
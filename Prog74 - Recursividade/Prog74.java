//Prog74 - Recursividade
//Stefano Giordano - 22/05/2020
//Recursividade ocorre quando um método chama a si proprio
//Exemplo: imprimir o fatorial de numeros de 0 a 10

public class Prog74
{
    public static void main(String args[])
    {
        
        for(int i = 0; i <= 10; i++)
            System.out.println(i + "! = " + fatorial(i));
        }
        
        //limite para numeros tipo int max é fatorial(16)
        //limite para numeros tipo long max é fatorial(20)
    public static int fatorial(int n)
    {
        if(n <= 1)
            return(1);
        else
            return(n * fatorial(n - 1));
    }
}

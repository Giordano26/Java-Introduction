//Prog40 - Loop de contagem usando tabulação 
//Stefano Giordano - 03/04/2020
//Aoresentar os numero de 50 a 1000 de 5 em 5
//Usar tabulação, isto é : imprimir os numeros na horizontal

public class Prog40
{
    public static void main(String[] args)
    {
        int n = 50;
        
        while (n <= 1000)
        {
            System.out.printf("%d\t", n);
            n = n + 5;
        }
    }
}

        
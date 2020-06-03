//Prog07 - Variaveis numericas com argumentos externos
//Stefano Giordano - 28/02/2020

public class Prog07
{
    public static void main(int[] args)
    {
        int a;
        int b;
        int c;
        
        a = args[0];
        b = args[1];
        c = a + b;
        
        System.out.println(a+ " + "+b+ " = " + c);
    }
}
        
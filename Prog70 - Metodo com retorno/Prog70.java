//Prog70 - metodos com retorno
//Stefano Giordano - 15/05/2020

public class Prog70
{
    public static void main(String args[])
    {
        System.out.println(somarR(4,25));
        System.out.println(somarR(100,300,150,8));
        System.out.println(quadradoR(20));
    }
    
    public static int somarR(int a, int b)
    {
        return a+b;
    }
    public static int somarR(int a , int b , int c, int d)
    {
        return a+b+c+d;
    }
    
    public static double quadradoR(int num)
    {
        return Math.pow(num,2);
    }
}


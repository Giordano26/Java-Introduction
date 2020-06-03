//Prog71 - Sobrecarga - Calculo de area
//Stefano Giordano - 15/05/2020

public class Prog71
{
    public static void main(String args[])
    {
        System.out.println("Area do quadrado = "+area(5));
        System.out.println("Area do retangulo = "+ area(4,8));
        System.out.println("Area do triangulo = "+ area(60,100,0));
    }
    
    public static double area(double l)
    {
        return l*l;
    }
    public static double area(double l1, double l2)
    {
        return l1*l2;
    }
    public static double area (double base, double altura, int zero)
    {
        return (base*altura)/2;
    }
}

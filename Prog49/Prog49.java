//Prog49 - Apresentar a tabuada do 7 de 0 a 20
//Stefano Giordano - 17/04/2020

public class Prog49
{
    public static void main(String[] args)
    {
        int t;
        for(int n = 0 ; n <= 20; n++)
        {
            t = n * 7;
            System.out.println("7 x "+n+ " = "+t);
        }
    }
}

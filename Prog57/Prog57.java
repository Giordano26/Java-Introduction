//Prog57 - Tabua de multiplicação
//Stefano Giordano - 30/04/2020
//Montar um tabua de multiplicação de 1 a 20

public class Prog57
{
    public static void main(String[] args)
    {
        int i, j;
        
        for (i = 1; i <= 20; i++)
            {
                for(j=1; j <= 20; j++)
                    System.out.printf("%5d", i*j);
                System.out.printf("\n");
            }
        }
    }
    
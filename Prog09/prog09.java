//Prog 09 - teste com variaveis flutuantes
// Stefano Giordano 05/03/2020

public class prog09
{
    public static void main(String[] args)
    {
        float H = 1/3;
        float I = 1/3f;
        float J = I + I + I;
        float K = 1/3 + 1/3 + 1/3;
        float L = 1/3f + 1/3f +1/3f;
        float M = 3 * 1/3;
        float N = 3 * (1/3);
        float O = 3 * 1/3f;
        
        
        System.out.println("float 1/3 =  " + H);
        System.out.println("float 1/3f =  " + I);
        System.out.println("float I + I + I =  " + J);
        System.out.println("float 1/3 + ... =  " + K);
        System.out.println("float 1/3f + ... =  " + L);
        System.out.println("float 3*1/3 =  " + M);
        System.out.println("float 3*(1/3) =  " + N);
        System.out.println("float 3*1/3f =  " + O);
        
    }
}
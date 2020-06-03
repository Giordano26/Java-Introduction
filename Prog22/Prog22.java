//Prog22 - Conversão tipo String
//Stefano Giordano - 20/03/2020

import java.util.*;

public class Prog22
{
    public static void main(String[] args)
    {
        String x = "90";
        String y = "35.89";
        int ix;
        float fx;
        double dx;
        
        //conversões
        ix = Integer.parseInt(x);
        fx = Float.parseFloat(y);
        dx = Double.parseDouble(y);
        
        System.out.println("String " +x+ " para int " +ix);
        System.out.println("String " +y+ " para float " +fx);
        System.out.println("String " +y+ " para double " +dx);
    }
}

        

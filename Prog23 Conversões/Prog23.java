 //Stefano Giordano - 20/03/2020

import java.util.*;
public class Prog23
{
    public static void main(String[] args)
    {
        float F = 10.56f;
        double D = 543.43;
        int I = 10;
        
        int II;
        float FF; 
        double DD;
        String SI, SF , SD;
        
        //conversões --> Integer x = Integer.valueOf(str);
        //or int y = Integer.parseInt(str);
        II = (int) F;
        FF = (float) I;
        DD = (double) I;
        SI = String.valueOf(I); // int to string, ou Integer.toString(I)
        SF = String.valueOf(F); 
        SD = String.valueOf(D);
        
        System.out.println(" float " +F+ " para int: " + II);
        System.out.println(" int " +I+ " para float: " + FF);
        System.out.println(" int " +I+ " para double: " + DD);
        System.out.println(" int " +I+ " para String: " + SI);
        System.out.println(" float " +F+ " para String: " + SF);
        System.out.println(" double " +D+ " para String: " + SD);
    }
}

        
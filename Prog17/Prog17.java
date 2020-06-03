//Prog 17 - Calculo da media escolar
// Stefano Giordano - 12/03/2020
//Entrar com 3 notas e calcular a media com apenas 1 casa decimal

import java.util.*;

public class Prog17
{
    public static void main(String[] args)
    {
        float N1, N2, N3, Media;
        
        System.out.println("Digite a Nota 1");
        Scanner sc = new Scanner(System.in);
        
        N1 = sc.nextFloat();
        
        System.out.println("Digite a Nota 2");
        sc = new Scanner(System.in);
        
        N2 = sc.nextFloat();
        
        System.out.println("Digite a Nota 3");
        sc = new Scanner(System.in);
        
        N3 = sc.nextFloat();
        
        
        Media = ((N1+N2+N3)/3);
        
        System.out.printf("A media das 3 notas é: %1.1f\n" , Media);
    }
}

        
        
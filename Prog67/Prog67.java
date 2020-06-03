//Prog67 - Inversão de string
//Stefano Giordano - 14/05/2020
//Entrar com um texto e apresentar  de forma invertida

import java.util.*;
public class Prog67{
    public static void main(String args[])
    {
        String Texto;
        
        System.out.println("Digite uma frase: ");
        Scanner sc = new Scanner(System.in);
        Texto = sc.nextLine();
        
        
        //texto invertido
        for( int i = Texto.length()-1; i>= 0; i--)
            System.out.print(Texto.charAt(i));
        System.out.print("\n");
    }
}


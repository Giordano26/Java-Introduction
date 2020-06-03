//Prog34 - Dias da semana
//Stefano Giordano - 27/03/2020
//Entrar com um numero de 1 a 7 e informar qual é o dia da semana

import java.util.*;
public class Prog33
{
    public static void main(String[] args)
    {
        int dia;
        String mens;
        
        System.out.println("Digite um numero de 1 a 7");
        Scanner sc = new Scanner(System.in);
        
        dia = sc.nextInt();
        
        switch (dia)
        {
            case 1: mens = "domingo"; break;
            case 2: mens = "segunda"; break;
            case 3: mens = "terça"; break;
            case 4: mens = "quarta"; break;
            case 5: mens = "quinta"; break;
            case 6: mens = "sexta"; break;
            case 7: mens = "sabado"; break;
            default: mens = "dia da semana INVÁLIDO";
        
        
        }
        
        System.out.println(dia + " equivale a " + mens);
    }
}


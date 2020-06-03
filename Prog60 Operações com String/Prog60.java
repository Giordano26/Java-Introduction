//Prog60 - Operações com Strings 
//Stefano Giordano - 07/05/2020

import java.util.*;

public class Prog60
{
    public static void main(String[] args)
    {
        String texto;
        
        System.out.println("Digite um texto grande qualquer:");
        Scanner sc = new Scanner(System.in);
        texto = sc.nextLine();
        
        //Tamanho da string
        System.out.println("Tamanho da String = "+ texto.length());
        //Maiusculas e minusculas
        System.out.println("Maiusculas = "+ texto.toUpperCase());
        System.out.println("Minusculas = "+ texto.toLowerCase());
        //Parte da String (substring)
        System.out.println("Parte do texto: da posição 4 até 8 = "+ texto.substring(4,9));
        //Substituição de caracteres
        System.out.println("Substitui 'a' por 'Z' = "+ texto.replace("a","z"));
        System.out.println("Retira espaços = "+ texto.replace(" ",""));
        System.out.println("Substitui 'a' por 'XXXXX' = " +texto.replace("a", "XXXXX"));
        //1 caracter de uma determinada posição 
        System.out.println("Caracter da posição 5 = " + texto.charAt(5));
        //o primeiro e ultimo caracter do texto
        System.out.println("O primeiro caracter = "+ texto.charAt(0)+" O ultimo = "+ texto.charAt(texto.length()-1));
        //o texto na vertical
        for(int i = 0; i < texto.length();i++)
        System.out.println(texto.charAt(i));
        
    }
}

        
        
        
        
        
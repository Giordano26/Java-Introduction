//Prog68 - Conversão de String em Array
//Stefano Giordano - 14/05/2020
//Entrar com um texto, converte-lo em array de caracteres
//Apresentar o array sepaarando os caracteres com "-"

import java.util.*;
public class Prog68
{
    public static void main(String args[])
    {
        String texto;
        
        System.out.println("Digite uma frase: ");
        Scanner sc = new Scanner(System.in);
        texto = sc.nextLine();
        
        //transformar o texto num Array de caracteres
        
        char textoArray [] = new char [texto.length()];
        
        texto.getChars(0, texto.length(), textoArray,0); 
        // pega o char na posição 0 do texto e passa para a posição 0 do array
        
        //Mostrar array com letras separadas
        for(int i = 0; i < textoArray.length; i++)
            System.out.print(textoArray[i]+"-");
        System.out.print("\n");
        
        //apresentação do array (sem o ultimo "-")
        int i;
        for( i = 0; i < textoArray.length -1; i++)
            System.out.print(textoArray[i]+"-");
        System.out.print(textoArray[i]);
        System.out.print("\n");
        
        
    }
}
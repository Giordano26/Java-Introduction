//Prog53 - Entrada de uma string pelo teclado
//Stefano Giordano - 23/04/2020
//Solicitar a digitação do nome e conferir se está  certo
//Reciclar o programa saindo somente quando correto parabenizando o operador

import java.util.*;
public class Prog53
{
    public static void main(String[] args)
    {
        String nomefix = "Jesse Pinkman";
        String nome;
        do
        {
            System.out.println("Digite o seu nome:");
            Scanner sc = new Scanner(System.in);
            
            nome= sc.nextLine();
            
            if (nome.equals(nomefix))
            {
                System.out.println("correto");
            }else{
                System.out.println(nome+" é divergente");
            }
            
        }
        
        while(nome.equals(nomefix) == false);
        
        System.out.println("parabens , voce acertou!");
    }
}


            
            
            
        
        
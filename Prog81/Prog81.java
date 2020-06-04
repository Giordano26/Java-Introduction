//Prog81 - Alteração de uma String (nome e sobrenome)
//Stefano Giordano 04/06/2020
//Entrar com um nome completo
//Reapresenta-lo destacando o ultimo sobrenome em primero lugar
//separar com virgula.
//Exemplo: o nome "Jose da Silva Gonçalves"
//é mudado para: "Gonçalves, Jose da Silva"
//reciclar o programa saindo quando digitar apenas Enter

import java.util.*;
public class Prog81
{
    public static void main(String [] args)
    {
        String nome, ultnome;
        int i;
        
        do
        {
            System.out.println("Digite um nome completo: ");
            Scanner sc = new Scanner(System.in);
            nome = sc.nextLine();
            
            nome = nome.trim(); //elimina eventuais brancos do inicio e do fim
            if (nome.equals(""))
                break;
            
            //obtem o ultimo sobrenome
            i = nome.length() -1; //ultimo caracter
            while( i >= 0)
            {
                if(nome.substring(i,i+1).equals(" "))
                    break;
                i--;
            }
            if (i <= 0)
                System.out.println("Não existe sobrenome para destacar");
            else
            {
                ultnome = nome.substring(i+1, nome.length());
                //apresenta o resultado
                System.out.println(ultnome+", "+nome.substring(0,i));
            }
        } while(true);
    }
}
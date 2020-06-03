//Prog77 - Sorteio num Array
//Stefano Giordano - 28/05/2020
//Entrar com 10 nomes de pessoas num array
//sortear um nome e apresentá-lo na tela
//reciclar o programa perguntando: Novo sorteio (S/N)?
//consistir as respostas

import java.util.*;
public class Prog77
{
    public static void main(String [] args)
    {
        String[] nomes = new String[10];
        int i;
        String aux = " ";
        
        for( i=0; i < 10; i++)
        {
            System.out.println("Digite o " + (i+1)+" º nome: ");
            Scanner sc = new Scanner(System.in);
            nomes[i] = sc.nextLine();
        }
        
        //Sorteio
        do
        {
            int nsorte = (int) (Math.random() * 10); //sorteia numeros de 0 a 9
            System.out.println("Nome sorteado: " + nomes[nsorte]);
            do
            {
               System.out.println("Novo sorteio? (S/N): ");
               Scanner sc = new Scanner(System.in);
               try
               {
                   aux = sc.nextLine();
                   aux = aux.toUpperCase(); // transforma aux em maiusculas
                }
               catch (Exception erro)
               {
                   System.exit(0);
                }
                
               if (aux.equals("S") || aux.equals ("N"))
                    break;
               System.out.println("digitação inválida");
            }while (true);
            if (aux.equals("N"))
                break;
            } while (true);
        }
    }


            
 
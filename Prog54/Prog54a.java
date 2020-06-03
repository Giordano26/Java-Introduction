//Prog54 - Numeros Primos
//Stefano Giordano - 23/04/2020
//Solicitar e apresentar uma certa quantidade de numeros primos
//Numero primo é o numero que somente é divisivel por 1 ou si mesmo
//Iniciar pelo numero que 2 que é primo

import java.util.*;
public class Prog54a
{
    public static void main(String[] args)
    {
        long n, qtd, cont, m;
        
        System.out.println("Digite a qtd de numero primos: ");
        Scanner sc = new Scanner(System.in);
        
        try
        {
            qtd = sc.nextInt();
            if( qtd > 0){
                
                cont = 0;        //contador de numeros primos
                n = 2;
                while ( cont < qtd)
                {
                  //procurando um numero primo
                  //divisoes sucessivas de n por 2 até n-1
                  //se ocorrer divisibilidade, então N não é primo
                  
                  for(m = 2; m < n ; m++)
                  {
                      if(n % m == 0)
                        break;    //sai do for
                  }
                  if( m == n)  //testa a saida do for não pelo break
                  { 
                    System.out.println(n);
                    cont = cont + 1;
                    }

                   n = n + 1;
                }
                
                
                
            }
            
        } catch (Exception erro)
         {  System.out.println("Erro");
             
            }
            
        }
        
    }
    
                    
            


//Prog35 - Calculadora de numeros reais
//Stefano Giordano - 02/04/2020
//Entrar com 2 numeros reais
//Apresetnar um menos das quatro opções:
//1 = soma, 2 = subtração, 3 = multiplicação, 4 = divisão
//avise que nao existe divisão por 0
//usar switch-case


import java.util.*;

public class Prog35
{
    public static void main(String[] args)
    {
        float n1, n2;
        int op;
        String mens;
        
        System.out.println("Digite o primeiro número para uma operção");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextFloat();
        
        System.out.println("Digite o segundo número para uma operação");
        sc = new Scanner(System.in);
        n2 = sc.nextFloat();
        
        System.out.println("Escolha a operação\n"+
                            "1 = soma\n2 = subtração\n3 = multiplicação\n4 = divisão");
        sc = new Scanner(System.in);
        op = sc.nextInt();
        
        switch (op)
        {
            case 1: mens = n1+ " + "+n2+" = "+(n1+n2); break;
            case 2: mens = n1+" - "+n2+" = "+(n1-n2); break;
            case 3: mens = n1+" x "+n2+" = "+(n1*n2); break;
            case 4: 
                  {
                      if (n2 == 0)
                          mens = "Não existe divisão por zero!";
                        else
                            mens = n1 + " / " +n2 + " = "+(n1/n2);
                            break;
                        }
                    
                    
            default: mens = "operação invalida";
        }
        
        System.out.println("Resultado: " + mens);
    }
}

                      
        
                            
         
         
        


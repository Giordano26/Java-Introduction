//Prog75 - Entrada de dados com métodos uteis
//Stefano Giordano - 22/05/2020
//Exemplo de métodos de grande utilidade

import java.util.*;
public class Prog75
{
    public static String LeStringNome(String texto)
    {
        System.out.println("Digite "+ texto);
        Scanner sc = new Scanner(System.in);
        String aux = sc.nextLine();
        return aux;
    }
    
    public static int LeNumerosInt(String texto, int minimo, int maximo)
    {
        int num = 0;
        while (true)
        {
            try
            {
                System.out.println("Digite " + texto + " (inteiro " + minimo +" e "+ maximo+")");
                Scanner sc = new Scanner(System.in);
                num = sc.nextInt(); // aqui pode acontecer um erro
                if (num < minimo || num > maximo)
                    System.out.println("INVÁLIDO. Está fora da faixa de " +minimo+" e " +maximo);
                else
                    break;
                }
            catch (Exception erro)
            {
                System.out.println("Erro: digite apenas numeros \n erro padrão: " + erro);
            }
        }
        return num;
    }
    
    public static float LeNumerosFloat(String texto, float minimo, float maximo)
    {
        float numF = 0;
        while (true)
        {
            try
            {
                System.out.println("Digite " + texto + " (" + minimo +" e "+ maximo+")");
                Scanner sc = new Scanner(System.in);
                numF= sc.nextFloat(); // aqui pode acontecer um erro
                if (numF < minimo || numF > maximo)
                    System.out.println("INVÁLIDO. Está fora da faixa de " +minimo+" e " +maximo);
                else
                    break;
            }
            catch (Exception erro)
            {
                System.out.println("Erro: digite apenas numeros \n erro padrão: " + erro);
            }
        }
        return numF;
    }
    
    public static void main(String args[])
    {
        String nome = LeStringNome("Nome");
        int idade = LeNumerosInt("Idade",0,120);
        float nota1 = LeNumerosFloat("Nota 1 ", 0,10);
        float nota2 = LeNumerosFloat("NOta 2 ", 0,10);
        
        System.out.println("\n========================================");
        System.out.println("nome: " + nome);
        System.out.println("idade: "+idade);
        System.out.println("Nota 1 : "+ nota1);
        System.out.println("Nota 2 : "+ nota2);
        System.out.println("Media: " + (nota1+nota2)/2);
        System.out.println("\n========================================");
    }
}

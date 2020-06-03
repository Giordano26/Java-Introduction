//Prog06 - Variaveis passadas por argumentos externos
//Stefano Giordano - 28/02/2020

public class Prog06
{
    public static void main(String[] args)
    {
        String nome;
        String RA;
        
        nome = args[0];
        RA = args[1];
        
        System.out.println(nome);
        System.out.println(RA);
    }
}

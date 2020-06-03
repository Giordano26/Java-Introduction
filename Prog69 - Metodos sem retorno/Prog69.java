//Prog69 - Metodos sem retorno
//Stefano Giordano 15/05/2020

public class Prog69
{
    public static void main(String args[])
    {
        imprimirTexto("Bom dia alunos");
        somar(100,300);
        somar(10,20,30,43);
        quadrado(5);
        maior(30,60,12);
        sexo('F');
        imprimirTexto("Pontificia universidade católica de são paulo");
    }
    
    public static void imprimirTexto(String tx)
    {
        System.out.println(tx);
    }

    public static void somar(int a , int b)
    {
        System.out.println(a + b);
    }
    
    public static void somar(int a, int b, int c, int d )
    {
        System.out.println(a+b+c+d);
    }
    
    public static void quadrado(int num)
    {
        System.out.println(Math.pow(num,2));
    }
    
    public static void maior(int a , int b, int c)
    {
        System.out.println(Math.max(c, Math.max(a,b)));
    }
    
    public static void sexo(char c)
    {
        if (c == 'M')
            System.out.println("Maculino");
        else if ( c == 'F')
            System.out.println("Feminino");
        else
            System.out.println("desconhecido");
        }
    }
    
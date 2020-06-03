//Prog41 - Loop de repetição de uma Frase
//Stefano Giordano - 03/04/2020
//Apresentar 5000 vezes a frase: "DEVO ESTUDAR PROGRAMAÇÃO"
//Mostrar a contagem a cada frase apresentada

public class Prog41
{
    public static void main(String[] args)
{
    String mens;
    int n = 0;
    mens = "DEVO ESTUDAR PROGRAMAÇÃO";
    
    while (n <= 5000)
    {
        System.out.println(n +" "+mens);
        n = n+1;
    }
}
}

    
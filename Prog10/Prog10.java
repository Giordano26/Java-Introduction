//Teste com variaveis em expressões matematicas
//Stefano Giordano - 05/03/2020

public class Prog10
{
    public static void main(String[] args)
    {
        float Hora = 13.45f , Yes = 11.4f , Tamoio = 3;
        double Resultado;
        
        Resultado = ((Hora * Yes)/(Tamoio + 5) + (9.3*(Yes-3))) / 3.12;
        
        System.out.println("Resultado =  " + Resultado);
    }
}

        
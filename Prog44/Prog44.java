//Prog44 - Teste de divisibilidade por 19
//Stefano Giordano - 16/04/2020
//Apresetnar os 15 primeiros numeros divisiveis por 19 a partir de 100

public class Prog44
{
    public static void main(String[] args)
    {
        int cont = 0; //contador
        int n = 100; //numero inicial
        
        while ( cont < 15)
        {
            if (n%19 == 0)
            {
                System.out.println(n+" é divisivel por 19");
                n++;
                cont++;
            }else if (n%19 != 0){
                n++;
            }
        }
    }
}

            
            
            
           
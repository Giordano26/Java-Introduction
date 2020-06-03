//Prog43 - Serie de fibonacci
//Stefano Giordano - 16/04/2020
//Aoresentar os 25 primeiros numeros da serie de fibonacci
//Os dois primeiros numeros sao 0 e 1
//os proximos são sempre a soma dos 2 numeros anteriores

public class Prog43
{
    public static void main(String [] args)
    {
        int cont; //contador
        int pen = 0 , ult = 1, novo;
        
        System.out.println(pen);
        System.out.println(ult);
        cont = 2;
        while ( cont <= 25)
        {
            novo = pen + ult;
            System.out.println(novo);
            pen = ult;
            ult = novo;
            cont++;
        }
    }
}

            
        
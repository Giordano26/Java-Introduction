//Teste de ano bissexto
//Stefano Giordano - 02/04/2020
//Entrar com o ano entre 1600 e 3000 e verificar se é bissexto
// o ano é divisivel por 400  OU 
//o ano é divisivel por 4 mas não é divisivel por 100


import java.util.*;
public class Prog37
{
    public static void main(String[] args)
    {
        int ano;
        String mens;
        
        System.out.println("Digite o ano (entre 1600 a 3000) para verificação: ");
        Scanner sc = new Scanner(System.in);
        
        ano = sc.nextInt();
        if((ano< 1600) || (ano > 3000)){
            mens = "Ano invalido";
        }else if((ano%400 == 0) || ((ano%4 == 0) && (ano%100 != 0))){
            mens = ano+" é bissexto";
        }else{
            mens = ano+ " não é bissexto";
        }
    
        System.out.println(mens);
    }
}

        
//Prog86 - Valores com arredondamento
//Stefano Giordano - 12/06/2020
//Entrar com um valor (R$) e um desconto (%)
//Calcular os valores finais com o deconto
//arredondando para baixo e para cima
//e considerando até os centavos
//Apresentar no final todos os dados envolvidos
//reciclar o programa saindo com o valor

import java.util.*;
public class Prog86
{
    public static void main (String args[])
    {
        float valor, desconto;
        double val1, val2;

        do
        {
            System.out.println("\nDigite o valor(R$) (0 para sair)");
            Scanner sc = new Scanner(System.in);
            valor = sc.nextFloat();
            if (valor <= 0)
                break;

            System.out.println("Digite o desconto(%): ");
            sc = new Scanner(System.in);
            desconto = sc.nextFloat();

            sc.close();

            valor = Math.round(valor *100); // reduz para 2 casas decimais, 1 usar * 10
            valor = valor/100;

            val1 = valor - (valor * desconto)/100;
            val1 = Math.floor(val1*100); //arredonda p o inteiro anterior
            val1 = val1/100;

            val2 = valor - (valor*desconto)/100;
            val2 = Math.ceil(val2*100); //aredonda p o inteiro superior
            val2 = val2/100;

            System.out.println("Valor principal: "+ valor +"\n"+
                "desconto: "+ desconto+"%\n"+
                "Valor resultado 1: "+ val1 +"\n"+
                "Valor resultado 2: "+val2 + "\n");
        } while(true);
    }
}
 
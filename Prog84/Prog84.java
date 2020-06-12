//Prog84 - Indice de Massa Corporal
//Stefano Giordano - 11/06/2020
//Entrar com peso e altura e calcular o IMC
//IMC = peso/(altura*altura)
//IMC               DESCRIAÇÃO
//menor que 18.5    Peso abaixo do normal
//entre 18.5 e 24.5 Peso ideal
//entre 24.5 e 29.9 Pré-obesidade
//entre 30 e 34.9   Obesidade Classe I
//entre 35 e 39.9   Obesidade Classe II (Severa)
//maior que 39.9    Obesidade Classe III (mórbida)
//Reciclar o programa saindo quando peso ou altura forem 0

import java.util.*;
public class Prog84{
    public static void main (String args[]){
        float altura, peso , IMC;
        String mens="";

        do{
            System.out.println("\nDigite sua altura (0 para sair)");
            Scanner sc = new Scanner(System.in);
            altura = sc.nextFloat();
            if(altura == 0)
                System.exit(0);
            if(altura < 0 || altura > 2.30){
                System.out.println("Altura inválida");
                continue;
            }
            System.out.println("Digite seu peso (0 para sair)");

            sc = new Scanner(System.in);
            peso = sc.nextFloat();
            if(peso == 0)
                System.exit(0);
            if(peso < 0 || peso > 300){
                System.out.println("Peso invalido");
                continue;
            }
            sc.close();

           
            
            

            IMC = peso/(altura*altura);

            if(IMC < 18.5)
                mens = "Peso abaixo do normal";
            else if(IMC >= 18.5 || IMC < 24.5)
                mens = "Peso ideal";
            else if(IMC >= 24.5 || IMC < 30)
                mens = "Pré-obesidade";
            else if(IMC >= 30 || IMC < 35)
                mens = "Obesidade Classe I";
            else if(IMC >= 35 || IMC < 39.9)
                mens = "Obesidade Classe II (Severa)";
            else if(IMC >= 39.9)
                mens = "Obesidade Classe III (mórbida)";

            System.out.printf("%s  IMC = %.1f \n",mens,IMC);

        }while(true);
    }
}
//Prog 38 - Consistencia de data
//Stefano Giordano 03/04/2020
/*
Entrar com 3 numeros inteiros: dia, mes e ano
fazer as devidas consistencias: 
ano de 1600 a 3000
meses: abril, junho, setembro e novembro tem 30 dias
os demais 31 exceto fevererio ou 29 quando é bissexto
Apresentar a data no formato DD/MM/AAAA ou dia, mes ou ano invalido 
Ordem de digitação: primeiro o dia, depois o mes e finalmente o ano
a medida do possivel, abortar o programa (System.exit(0)) com uma 
mensagem de invalidez
dica: usar uma variavel por ex. ult para o ultimo dia do mes: 31, 30 29 ou 28
*/

import java.util.*;

public class Prog38
{
    public static void main(String[] args)
    {
        int dia, mes , ano, anot;
        
        
        final int bis = 1;
        final int nbis = 0;
        anot = 2;
        
        System.out.println("Digite a data no formato: DD/MM/AAAA");
        System.out.println("Digite o dia: ");
        
        Scanner sc = new Scanner(System.in);
        dia = sc.nextInt();
        
        if ( (dia > 31) || (dia < 1)){
        System.out.println("Data inválida");
        System.exit(0);
        }else{
        }
    
        System.out.println("Digite o mês: ");
        
        sc = new Scanner(System.in);
        mes = sc.nextInt();
        if( (mes > 12) || (mes < 1)){
           System.out.println("Data inválida");
           System.exit(0);
        }else{
        }
        
        
        System.out.println("Digite o ano (entre 1600 e 3000): ");
        
        sc = new Scanner(System.in);
        ano = sc.nextInt();
        
        if( (ano < 1600) || (ano > 3000)){
            System.out.println("Data inválida");
            System.exit(0);
        }else if((ano%400 == 0) || ((ano%4 == 0) && (ano%100 != 0))){
            anot =  bis;
        }else{
            anot =  nbis;
        }
        
        switch(mes){
            case 1: mes = 1; break;
            case 2: if (dia > 29){
                System.out.println("Data inválida");
                System.exit(0);
            } else if(anot == bis){
                        if (dia > 29){
                        System.out.println("Data inválida");
                        System.exit(0);
                    }else{ mes = 2;
                    }
                }else if (anot == nbis){
                    if (dia > 28){
                        System.out.println("Data inválida");
                        System.exit(0);
                    }else{ mes = 2;
                    }
                }
                break;
            case 3: mes = 3; break;
            case 4: if (dia > 30){
                        System.out.println("Data inválida");
                        System.exit(0);
                    }else{ mes = 4;
                    } 
            break;
            case 5: mes = 5; break;
            case 6: if (dia > 30){
                        System.out.println("Data inválida");
                        System.exit(0);
                    }else{ mes = 6;
                    } 
                    break;
            case 7: mes = 7;
            case 8: mes = 8;
            case 9:  if (dia > 30){
                        System.out.println("Data inválida");
                        System.exit(0);
                    }else{ mes = 9;
                    } 
                    break;
            case 10: mes = 10; break;
            case 11:  if (dia > 30){
                        System.out.println("Data inválida");
                        System.exit(0);
                    }else{ mes = 11;
                    } 
            case 12: mes = 12; break;
            
            default: System.out.println("Data inválida"); break;
        }
        
       
        System.out.println("A data: "+dia+"/"+mes+"/"+ano+" é válida");
    }
}
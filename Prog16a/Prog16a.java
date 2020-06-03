//Prog16 - Calculo de tempo em segundos 
//Stefano Giordano - 06/03/2020

//Entrar co qtnd de segundos e calcular quantos
//anos, meses , dias , horas , minutos e segundos
//1 ano tem 12 meses
//1 mes tem 30 dias
//1 dia tem 24 horas
//1 hora tem 60 minutos
//1 minuto tem 60 segundos
//dica: trabalhar com numeros inteiros
// utilzador o operador "%" (resto da divisão)


import java.util.*;

public class Prog16a
{
    public static void main(String[] args)
    {
        int segundos, minutos, horas, dias, meses, anos;
        int restm,resth,restd,restmes,resta;
        
        
        System.out.println("Digite o tempo em segundos");
        Scanner sc = new Scanner(System.in);
        
        segundos = sc.nextInt();
        
        anos = segundos/(12*30*24*60*60);
        resta = segundos%(12*30*24*60*60);
        
        meses = resta/(30*24*60*60);
        restmes = resta%(30*24*60*60);
        
        dias = restmes/(24*60*60);
        restd = restmes%(24*60*60);
        
        horas = restd/(60*60);
        resth = restd%(60*60);
        
        minutos = resth/60;
        restm = resth%60;
        
        segundos = restm; 
        
        
        System.out.println("Anos: " +(anos));
        System.out.println("Meses: " +(meses));
        System.out.println("Dias: " +(dias));
        System.out.println("Horas: " +(horas));
        System.out.println("Minutos: " +(minutos));
        System.out.println("Segundos: " +(segundos));
        
    }
}

        
        
       
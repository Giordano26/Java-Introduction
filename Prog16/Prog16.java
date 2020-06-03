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

public class Prog16
{
    public static void main(String[] args)

    {
        int segundos,minutos,horas,dias,meses,anos;
        int restm,resth,restd,restmes,resta;
        
      
        
        System.out.println("Digite o tempo desejado em segundos");
        Scanner sc = new Scanner(System.in);
        
        segundos = sc.nextInt();
        minutos = segundos/60; 
        horas = minutos/60;
        dias = horas/24;
        meses = dias/30;
        anos = meses/12; 
        
        restm = segundos%60;
        resth = minutos%60;
        restd = horas%24;
        restmes = dias%30;
        resta = meses%12;
        
        
        
        
        if (segundos >= 60){
            segundos = restm;
        } else{ }
        if (minutos >=60){
            minutos = resth;
        } else { }
        if (horas >=24) {
            horas = restd;
        } else { }
        if (dias >=30) {
            dias = restmes;
        } else { }
        if (meses >=12) {
            meses = resta;
        } else { }
        
        
        
        System.out.println("Anos:  " +(anos));
        System.out.println("Meses:  " +(meses));
        System.out.println("Dias:  " +(dias));
        System.out.println("Horas:  " +(horas));
        System.out.println("Minutos:  " +(minutos));
        System.out.println("Segundos:  " +(segundos));
        
    }
}

            
        
        
    

        
        
        
            
        
        
       


        
        
        
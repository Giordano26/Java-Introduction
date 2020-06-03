//Prog46 - Verificação de peso ideal com reciclagem
//Stefano Giordano - 16/04/2020
//Entrar com sua altura em metros
//Usar a formula PesoIdeal = (Altura - 119) * 5.0 / 8.0 + 45
//altura esta em cm
//Reciclar o programa e sair quando a altura for 0

import java.util.*;

public class Prog46
{
    public static void main(String[] args)
    {
        double altura ;
        double pesoideal;
        
        do{
            System.out.println("Digite sua latura em metros(0 para sair): ");
            Scanner sc = new Scanner(System.in);
            
            altura = sc.nextDouble();
            if(altura <= 0){
                break;
            }
            altura = altura * 100;
            
            pesoideal = (altura - 119) * 5.0 / 8.0 + 45;
            System.out.println("O seu peso ideal é: "+ pesoideal+ " Kg");
        } while ( altura != 0);
        
        System.out.println("Saida solicitada");
        
    }
}

    
    

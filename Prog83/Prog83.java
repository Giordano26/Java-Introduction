//Prog83 - Consistencia de horario
//Stefano Giordano - 05/06/2020
//entrar com um horario no formato HH:MM:SS
//verificar se está correto 
//mostrar todos os erros se for o caso
//reciclar o programa, saindo quando deixar em branco

import java.util.*;
public class Prog83
{
    public static void main(String args[])
    {
        String hora, mens;
        String HH, MM ,SS;
        int H = 0 , M = 0 , S = 0;
        do
        {
            System.out.println("\nDigite a hora no formato: HH:MM:SS");
            Scanner sc = new Scanner(System.in);
            hora = sc.nextLine();
            hora = hora.strip(); //retirar os espaços em branco
            if (hora.equals(""))
                System.exit(0);

            sc.close();

            try{
                HH = hora.substring(0,2);
                MM = hora.substring(3,5);
                SS = hora.substring(6);
                H = Integer.parseInt(HH);
                M = Integer.parseInt(MM);
                S = Integer.parseInt(SS);
                mens = "";
            } catch (Exception error){
                System.out.println("Formato Errado");
                continue;
            }

            if( H < 0 || H >= 24){
                mens = "Hora inválida\n";
            }
            if ( M < 0 || M >= 60){
                mens = "Minuto inválido\n";
            }
            if ( S < 0 || S >= 60){
                mens = "Segundo inválido\n";
            }
            if(mens.equals("")){
                mens = "Formato válido\n";
            }
            System.out.println(mens);
        } while(true);
    }
}

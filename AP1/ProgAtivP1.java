//ProgAtivP1 Acesso a conta bancaria

import java.util.*;

public class ProgAtivP1{
    public static void main(String[] args){
        int op,contsenha= 0; // Operações e contador da senha
        double valorfinal = 0, deposito = 0, valorsaque = 0;
        String senha = " ";
        final String senhacorreta = "Java"; //Senha correta
        Scanner sc = new Scanner(System.in);
        //Inicio verificação de senha
        while(contsenha <= 3){
            System.out.println("Digite a senha");
            senha = sc.nextLine();
        if(senha.equals(senhacorreta)){
            break;
        }else{
            contsenha++;
            System.out.println("Senha inválida");
            if(contsenha >= 3){
                System.out.println("Conta bloqueada");
            System.exit(0);}
        }
        //Final da verificação de senha
        }
        //Inicio dos operadores
        do{
            System.out.printf("1.Deposito\n2.Retirada\n3.Saldo\n4.Saida\n");
            System.out.println("Digite a operação");
            sc = new Scanner(System.in);
            op = sc.nextInt();

            switch(op){
                case 1: 
                System.out.println("Operação de depósito selecionada");
                System.out.printf("Saldo da conta %.2f\n", valorfinal);
                System.out.println("Deseja depositar quanto?");
                sc = new Scanner(System.in);
                deposito = sc.nextDouble();
                if(deposito < 0){
                    System.out.println("Valor negativo bloqueado");
                    break;
                }
                valorfinal = valorfinal + deposito;
                System.out.println("Foram depositados: "+ deposito);
                System.out.printf("Saldo da conta %.2f\n", valorfinal);
                break;
                
                case 2:
                System.out.println("Operação de Saque selecionada");
                System.out.printf("Saldo disponível na conta %.2f\n", valorfinal);
                System.out.println("Deseja sacar?");
                sc = new Scanner(System.in);
                valorsaque = sc.nextDouble();
                if(valorsaque > valorfinal){
                    System.out.println("Saldo Insuficiente");
                    break;
                }if(valorsaque < 0){
                    System.out.println("Valor negativo bloqueado");
                    break;
                }
                valorfinal = valorfinal - valorsaque;
                System.out.println("Foram sacados: "+ valorsaque);
                System.out.printf("Saldo da conta %.2f\n", valorfinal);
                break;

                case 3:
                System.out.println("Operação de saldo selecionada");
                System.out.printf("Saldo disponivel %.2f\n", valorfinal);
                break;

                case 4:
                System.out.println("Saída requisitada!");
                System.out.printf("Fim da operação\nPrograma desenvolvido por Stefano Martins Ferreira Giordano\n");
                System.exit(0);
                default: System.out.println("Operação inválida");break;
            }
            
        }while(op != 4 );
        //Final dos operadores
        

        
    }
}

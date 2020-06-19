//ProgAtivP2 - Controle de um Hotel 
//Stefano Giordano - 18/06/2020 
//Controlar a  lotação de um hotel de 12 andares com 10 quartos por andar 
//Obs: os quartos deverão estar "livres" ou "ocupados" (no inicio do programa todos os quartos  deverão estar “livres”) 
//Criar um menu com as 4 opções: 
//1.Apresentar  ( mostrar a situação de todos os quartos do hotel) 
//2.Ocupar  (um determinado quarto, avisar já estiver ocupado) 
//3.Desocupar  (um determinado quarto, avisar se já estiver desocupado) 
//4.Sair  (sair do programa) 

import java.util.*;
public class ProgAtiv2{
    public static void main(String args[]){

        String hotel [][] = new String [12][10];
        int nAndar,nQuarto,op = 0;

        for(int lin = 0; lin < 12 ;lin++)
            for(int col = 0; col < 10;col++ ){
                hotel[lin][col] ="Livre" ;
            }

        System.out.println("\tq1\tq2\tq3\tq4\tq5\tq6\tq7\tq8\tq9\tq10");
        for(int lin = 0; lin < 12; lin++)
        {
            System.out.print("Andar"+(lin+1)+"\t");
            for(int col = 0; col < 10; col++)
                System.out.print(hotel[lin][col]+"\t");

            System.out.printf("\n");
        }

        do{
            System.out.print("\n1.Apresentar\n2.Ocupar\n3.Desocupar\n4.Sair \n");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            switch(op){
                case 1: 
                System.out.println("Operação 1 selecionada");
                System.out.println("\tq1\tq2\tq3\tq4\tq5\tq6\tq7\tq8\tq9\tq10");
                for(int lin = 0; lin < 12; lin++)
                {
                    System.out.print("Andar"+(lin+1)+"\t");
                    for(int col = 0; col < 10; col++)
                        System.out.print(hotel[lin][col]+"\t");

                    System.out.printf("\n");
                }
                break;

                case 2:
                System.out.println("Operação 2 Selecionada");
                System.out.println("Digite o n do Andar");
                sc = new Scanner(System.in);
                nAndar = sc.nextInt();
                if(nAndar < 1 || nAndar > 12){
                    System.out.println("Andar inválido");
                    break;
                }
                System.out.println("Digite o n do Quarto");
                sc = new Scanner(System.in);
                nQuarto = sc.nextInt();
                if(nQuarto < 1 || nQuarto > 10){
                    System.out.println("Quarto Inválido");
                    break;
                }
                
                if(hotel[nAndar-1][nQuarto-1].equals("Ocupado")){
                    System.out.println("Quarto já ocupado");
                    break;
                }

                hotel[nAndar-1][nQuarto-1] = "Ocupado";break;

                case 3:
                System.out.println("Operação 3 selecionada");
                System.out.println("Digite o n do Andar");
                sc = new Scanner(System.in);
                nAndar = sc.nextInt();
                if(nAndar < 1 || nAndar > 12){
                    System.out.println("Andar inválido");
                    break;
                }
                System.out.println("Digite o n do Quarto");
                sc = new Scanner(System.in);
                nQuarto = sc.nextInt();
                if(nQuarto < 1 || nQuarto > 10){
                    System.out.println("Quarto Inválido");
                    break;
                }
                 if(hotel[nAndar-1][nQuarto-1].equals("Livre")){
                    System.out.println("Quarto já está Livre");
                    break;
                 }
                
                hotel[nAndar-1][nQuarto-1] = "Livre"; break;
                
                case 4: 
                System.out.println("Saída requisitada");
                System.exit(0);
                
                default: System.out.println("Operação Inválida");

            }

        }while(true);
    }
}

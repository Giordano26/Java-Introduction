//Prog85 - Quadro de vendas de livros de lançamento
//Stefano Giordano - 12/06/2020
//Manter um quadro de vendas de livro de uma editora
//São 4 vendedores (codigos: 1 a 4)
//e 8 livros de lançamento (codigos 1 a 8)
//Recicalr a seguinte entrada dos relatiorios de vendas:
//Entrar com o codigo do vendedor, o codigo do livro e a  qtd. vendida
//Apos cada entrada, apresentar o quadro de vendas atualizado

import java.util.*;
public class Prog85
{
    public static void main(String args[])
    {
        int [] [] quadro = new int [4][8];
        int vend, livro, qtd;
        
        for(int lin = 0; lin < 4; lin++)
            for(int col = 0; col < 8; col++)
                quadro[lin][col] = 0;
         
        do
        {
            vend = 0;
            System.out.println("\nCodigo do vendedor (1 a 4) (0 = saida)");
            Scanner sc = new Scanner(System.in);
            vend = sc.nextInt();
            if( vend <= 0)
                break;
            if (vend > 4)
            {
                System.out.println("O codigo do vendedor deve ser de 1 a 4)");
                continue;
            }
            
            livro = 0;
            System.out.println("Codigo do livro (1 a 8) (0 = saida)");
            sc = new Scanner(System.in);
            livro = sc.nextInt();
            
            if(livro <= 0)
                break;
            if(livro > 8)
            {
                System.out.println("O codigo do livro deve ser de 1 a 8)");
                continue;
            }
            
            qtd = 0;
            System.out.println("Qtd vendida: ");
            sc = new Scanner (System.in);
            qtd = sc.nextInt();
            
            sc.close();
            
            quadro[vend-1][livro-1] = quadro[vend-1][livro-1] + qtd;
            
            System.out.println("\tliv1\tliv2\tliv3\tliv4\tliv5\tliv6\tliv7\tliv8");
            
            for(int lin = 0; lin < 4; lin++)
            {
                System.out.print("vend"+(lin+1)+"\t");
                for(int col = 0; col < 8; col++)
                    System.out.print(quadro[lin][col]+"\t");
                
                System.out.printf("\n");
            }
        } while(true);
    }
}

        
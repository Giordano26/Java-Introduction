//Prog29 - Comparação entre dois numeros
//Stefano Giordano - 26/03/2020
// Dizer qual é maior ou se são iguais
//entrar graficamente

import javax.swing.JOptionPane;
public class Prog29
{
    public static void main(String [] args)
    {
        String aux;
        int n1, n2;
        
        aux = JOptionPane.showInputDialog("Digite o primeiro número: ");
        n1 = Integer.parseInt(aux);
        
        aux = JOptionPane.showInputDialog("Digite o segundo número: ");
        n2 = Integer.parseInt(aux);
        
        if(n1==n2){
          JOptionPane.showMessageDialog(null,"os números são iguais");
            
        }else if( n1> n2){
         JOptionPane.showMessageDialog(null,n1+" é maior que "+n2);
        }else{
          JOptionPane.showMessageDialog(null,n1+" é menor que "+n2);
        }
    }
}

     
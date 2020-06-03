//Prog21 Entrada com Painel graficamente
//Stéfano Giordano - 20/03/2020

import javax.swing.JOptionPane;
public class Prog21 
{
    public static void main(String[] args)
    {
        String aux = " ";
        float num1 = 0, num2 = 0, media = 0;
        
        aux = JOptionPane.showInputDialog("Digite o primeiro numero ");
        num1 = Float.parseFloat(aux);
        
        aux= JOptionPane.showInputDialog("Digite o segundo numero ");
        num2 = Float.parseFloat(aux);
        
        media = (num1 + num2)/2;
        JOptionPane.showMessageDialog(null, "Media entre " +num1+ " e "+num2+" = "+media);
    }
}

        
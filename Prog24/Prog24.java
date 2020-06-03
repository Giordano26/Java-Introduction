//Prog24 Entrada grafica e calculo da area do trinagulo
//Stefano Giordano - 20/03/2020

import javax.swing.JOptionPane;
public class Prog24
{
    public static void main(String[] args)
    {
        String aux = " ";
        float base , altura, area;
        
        aux = JOptionPane.showInputDialog("Digite a medida da base");
        base = Float.parseFloat(aux);
        
        aux = JOptionPane.showInputDialog("Digite a medida da altura");
        altura = Float.parseFloat(aux);
        
        area = (base*altura)/2;
        
        JOptionPane.showMessageDialog(null, "Área do triangulo é " + area, 
        "Calculo da area do triângulo", JOptionPane.PLAIN_MESSAGE);
        
        //ou .INFORMATION_MESSAGE
        //ou .QUESTION_MESSAGE
        //ou .ERROR_MESSAGE
        //ou .WARNING_MESSAGE
    }
}

        
        
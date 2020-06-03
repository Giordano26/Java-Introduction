//Prog30 Entrada de caracter com teste sem usar "else"
//Entrar graficamente (JOptionPane)
//Stefano Giordano - 26/03/2020

import javax.swing.JOptionPane;
public class Prog30
{
    public static void main(String[] args)
    {
        String aux =" ", mens;
        aux = JOptionPane.showInputDialog("Digite um resposta S ou N");
        //(Aqui dispensa conversão, pois o que for digitado já é String)
        //(mas ATENÇÃO: o que foi digitado não pode ser considerado com char)
        
        mens = "Foi digitado: " + aux;
        
        aux = aux.toUpperCase();               //trasnforma aux em maiúisculas
        if (! aux.equals("S") && ! aux.equals("N"))
            mens = mens + "      Digitação INVALIDA";
        
        
        JOptionPane.showMessageDialog(null, mens, "Teste de digitação", JOptionPane.PLAIN_MESSAGE);
        //ou .INFORMATION_MESSAGE
        //ou .QUESTION_MESSAGE
        //ou .ERROR_MESSAGE
        //OU .WARNING_MESSAGE
    }
}

            
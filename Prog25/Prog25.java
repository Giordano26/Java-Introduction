//Prog25  Entrada grafica de tempo de processamento
//Stefano Giordano - 20/03/2020
//Considerando a velocidade da internet banda larga = 2mb/s (2 megabits por segundo)
//Entrar com o tamanho do arquivo em bytes. (1 byte = 8bits)
//Calcular o tempo de donwload desse arquivo em segundos
//Dica: Calcular e apresentar o tamanho do arquivo em MB megabytes e Mb (megabits)

import javax.swing.JOptionPane;
public class Prog25
{
    public static void main(String[] args)
    {
        String aux = " ";
        int tarq; //tamanho do arquivo em bytes
        float tarqMB , tarqmb , segs; //tempo em segundos
        
        aux = JOptionPane.showInputDialog("Digite o tamanho do arquivo em bytes");
        tarq = Integer.parseInt(aux);
        
        tarqMB = (tarq*0.000001f);
        tarqmb = (tarqMB*8);
        
        segs = (tarqmb/2);
        
        JOptionPane.showMessageDialog(null, tarqmb+"Mb"+" Tempo de download: "+segs+" Segundos",
        "Arquivo de "+tarq+" Bytes"+" ("+tarqMB+"MB"+")", JOptionPane.INFORMATION_MESSAGE);
    }
}

       
        
        
        
//Prog78 - Sorteio num array
//Stefano Giordano - 28/05/2020
//Entrar com 10 nomes de pessoas numa array
//Utilizar para a entradade dos nomes o metodo showInputDialog
//Sortear um nome e apresentá-lo na tela
//reciclar o programa perguntando: Novo sorteio (S/N)?
//Consistir as repostas


import javax.swing.JOptionPane;
public class Prog78
{

    public static void main(String [] args)
    {
        String [] nomes = new String[10];
        int i;
        String aux;
        for (i = 0; i < 10; i++)
        {
            aux = JOptionPane.showInputDialog("Digite o "+(i+1)+"º nome: ");
            nomes[i] = aux;
        }
        //Sorteio
        do
        {
            int nsorte = (int) (Math.random() * 10);
            
            JOptionPane.showMessageDialog(null, "Nome sorteado: "+ nomes[nsorte],"SORTEIO DE NOMES", JOptionPane.INFORMATION_MESSAGE);
            
            do
            {
                aux = JOptionPane.showInputDialog("Novo sorteio? (S/N): ");
                try
                {
                    aux = aux.toUpperCase();
                }
                catch (Exception erro)
                {
                    System.exit(0);
                }
                
                if(aux.equals("S") || aux.equals("N"))
                    break;
                JOptionPane.showMessageDialog(null, "digitação invádlia","", JOptionPane.ERROR_MESSAGE);
                
            } while (true);
            if (aux.equals("N"))
                break;
            }while (true);
        }
    }
    
        
    

    
            
            

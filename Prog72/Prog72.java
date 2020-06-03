//Prog72 - chamada de metodos de classe externa
//Stefano Giordano - 15/05/2020
//A classe externa deve estar na mesma pasta

public class Prog72
{
    public static void main(String args[])
    {
        //metodos sem retorno
        Prog69.imprimirTexto("Olá amigos eu sou o Prog72, usando o prog69 e o Prog70");
        Prog69.maior(7,81,700);
        Prog69.quadrado(9);
        Prog69.somar(1,2,3,4);
        
        
        //metodo com retorno
        System.out.println(Prog70.somarR(2000,135));
        int soma = Prog70.somarR(10,20);
        System.out.println(soma);
        
    }
}

        
        
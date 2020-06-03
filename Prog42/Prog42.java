//Prog 42 - Numeros destacados pela sua multiplicidade
//Stefano Giordano - 03/04/2020
//Marcar todos os numeros divisiveis por 7

public class Prog42
{
    public static void main(String[] args)
    {
    int n = 0;
    
    while (n <= 100)
{
    if (n%7 == 0){
        System.out.println(n+" X");
        n = n+1;
    }else{
        System.out.println(n);
        n = n+1;
    }
}
}
}


//Prog76 - Utilizando os métodos utilitarios do Prog75
//Stefano Giordano - 22/05/2020

public class Prog76
{
    public static void main(String args[])
    {
        String nome = Prog75.LeStringNome("Nome do funcionário");
        float salario = Prog75.LeNumerosFloat("Salario", 500, 10000);
        int dependentes = Prog75.LeNumerosInt("Dependentes",0,8);
        
        System.out.println("\n ===============================================");
        System.out.println("Nome do funcionário: " + nome);
        System.out.printf("Salário: %8.2f\n", salario);
        System.out.println("Dependentes: " + dependentes);
        System.out.println("\n ===============================================");
    }
}
/*25. Exibir todos os números de 1000 a 1999 que quando divididos por 11 deixam resto = 5.*/

public class Exercicio25 {
    public static void main(String[] args)
    {
        for (int x = 1000; x <= 1999; x++)
        {
            if (x % 11 == 5)
            {
                System.out.println(x);
            }
        }
    }
}

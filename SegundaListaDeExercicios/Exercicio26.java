import javax.swing.JOptionPane;

/*26. Exibir todos os divisores de um número inteiro positivo lido.*/

public class Exercicio26 {
    public static void main(String[] args)
    {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}

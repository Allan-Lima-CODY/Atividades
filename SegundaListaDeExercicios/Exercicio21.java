import javax.swing.JOptionPane;

/*21. Sabe-se que um ano é bissexto se for divisível por 400 ou se for divisível por 4 e não for
divisível por 100. Por exemplo: 1988, 1992, 1996, 2020. Determinar se um determinado ano
lido é bissexto.*/

public class Exercicio21 {
    public static void main(String[] args)
    {
        int ano;

        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano: "));

        if ((ano % 4 == 0) || (ano % 400 == 0))
        {
            System.out.println("O ano " + ano + " é bissexto.");
        }
        else
        {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}

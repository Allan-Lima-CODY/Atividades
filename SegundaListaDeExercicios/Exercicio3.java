import javax.swing.JOptionPane;

/*3. Ler um número e verificar se ele é par ou ímpar.*/

public class Exercicio3 {
    public static void main(String[] args)
    {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número qualquer: "));

        if (numero % 2 == 0)
        JOptionPane.showMessageDialog(null, "O número é par!");

        else 
        JOptionPane.showMessageDialog(null, "O número é ímpar!");
    }
}

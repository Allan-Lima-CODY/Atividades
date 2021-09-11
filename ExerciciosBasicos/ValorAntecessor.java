import javax.swing.JOptionPane;

public class ValorAntecessor {
    public static void main (String[] args)
    {
        int num, menosUm;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber seu antecessor: "));

        menosUm = num - 1;

        JOptionPane.showMessageDialog(null, "O antecessor do número " + num + " é: " + menosUm);
    }
}
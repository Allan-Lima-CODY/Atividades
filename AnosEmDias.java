import javax.swing.JOptionPane;

public class AnosEmDias {
    public static void main (String[] args)
    {
        int anos, anosEmDias;

        anos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você tem: "));

        anosEmDias = anos * 365;

        JOptionPane.showMessageDialog(null, "Você tem " + anosEmDias + " dias de vida.");
    }
}
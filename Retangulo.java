import javax.swing.JOptionPane;

public class Retangulo {
    public static void main (String[] args)
    {
        Double base, altura, area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do retângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do retângulo: "));

        area = base * altura;

        JOptionPane.showMessageDialog(null, "A área desse retângulo é igual a: " + area + ".");
    }
}
import javax.swing.JOptionPane;

/*17. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A
fórmula de conversão é: F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C a
temperatura em Celsius.*/

public class Exercicio17 {
    public static void main(String[] args)
    {
        Double fah, cel;

        cel = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em graus Celsius: "));

        fah = cel * (9/5) + 32;

        JOptionPane.showMessageDialog(null, "Essa temperatura em fahrenheit é: " + fah);
    }
}

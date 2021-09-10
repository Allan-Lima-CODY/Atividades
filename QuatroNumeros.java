import javax.swing.JOptionPane;

public class QuatroNumeros {
    public static void main (String[] args)
    {
        int valor, segundoValor, terceiroValor, quartoValor, resultado;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        terceiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        quartoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor: "));

        valor = valor * valor;
        segundoValor = segundoValor * segundoValor;
        terceiroValor = terceiroValor * terceiroValor;
        quartoValor = quartoValor * quartoValor;

        resultado = valor + segundoValor + terceiroValor + quartoValor;

        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }
}
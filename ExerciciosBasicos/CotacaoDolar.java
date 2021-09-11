import javax.swing.JOptionPane;

public class CotacaoDolar {
    public static void main (String[] args)
    {
        double valorDolar, qtdDolar, real;

        valorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do dolar atual: "));
        qtdDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos dolares serão usados para a conversão: "));

        real = valorDolar * qtdDolar;

        JOptionPane.showMessageDialog(null, "O valor em reais é: R$" + real);
    }
}
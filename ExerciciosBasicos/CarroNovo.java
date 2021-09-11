import javax.swing.JOptionPane;

public class CarroNovo {
    public static void main (String[] args)
    {
        Double valorCarro, dscntDistribuidor, dscntImposto;

        valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total do carro: "));

        dscntDistribuidor = valorCarro * 0.28;
        dscntImposto = dscntDistribuidor + valorCarro * 0.45;

        valorCarro = valorCarro + dscntDistribuidor + dscntImposto;

        JOptionPane.showMessageDialog(null, "O valor do carro com os reajuste do distribuidor e imposto é: " + valorCarro);
    }
}
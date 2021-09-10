import javax.swing.JOptionPane;

public class VendedoraDeCarros {
    public static void main (String[] args)
    {
        Double salarioFixo, comissaoPorCarro, salarioFinal, salarioIntervalo, qtdCarros;

        salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite os salário fixo do vendedor: "));
        qtdCarros = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de carros vendidos pelo vendedor: "));
        comissaoPorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissão do funcionário por cada carro vendido: "));

        salarioIntervalo = qtdCarros * comissaoPorCarro + salarioFixo;
        salarioIntervalo = salarioIntervalo * 0.05;
        salarioFinal = qtdCarros * comissaoPorCarro + salarioFixo + salarioIntervalo;

        JOptionPane.showMessageDialog(null, "O salário final do vendedor igual a: R$" + salarioFinal);
    }
}

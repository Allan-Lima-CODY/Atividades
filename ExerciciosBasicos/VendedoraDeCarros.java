import javax.swing.JOptionPane;

public class VendedoraDeCarros {
    public static void main(String[] args) {
        Double salarioFixo, comissaoPorCarro, salarioFinal, qtdCarros, vendasEmValor, comissaoDasVendas;

        int funcionario = 0;

        while (funcionario < 3) 
        {
            salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite os salário fixo do vendedor: "));
            qtdCarros = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de carros vendidos pelo vendedor: "));
            comissaoPorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissão do funcionário por cada carro vendido: "));
            vendasEmValor = Double.parseDouble(JOptionPane.showInputDialog("Digite qual foi o valor total que o funcionário vendeu em carros: "));

            if (vendasEmValor > 300000) {
                comissaoDasVendas = vendasEmValor * 0.05;

                salarioFinal = (qtdCarros * comissaoPorCarro) + salarioFixo + comissaoDasVendas;

                JOptionPane.showMessageDialog(null, "O salário final do vendedor igual a: R$" + salarioFinal);
            }

            else {
                salarioFinal = (qtdCarros * comissaoPorCarro) + salarioFixo;

                JOptionPane.showMessageDialog(null, "O salário final do vendedor igual a: R$" + salarioFinal);
            }

            funcionario++;
        }
    }
}

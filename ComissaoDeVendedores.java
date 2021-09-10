import javax.swing.JOptionPane;

public class ComissaoDeVendedores {
    public static void main (String[] args)
    {
        int qtdProdutos;
        double valorProduto, totalVenda, comissaoVendedor;

        qtdProdutos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto vendido: "));
        valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário do produto vendido: "));

        totalVenda = qtdProdutos * valorProduto;

        comissaoVendedor = totalVenda * 0.05;

        JOptionPane.showMessageDialog(null, "A comissão do vendedor é: " + comissaoVendedor);
    }
}
import javax.swing.JOptionPane;

/*10. Fazer um programa que recebe o preço de um produto, calcula e mostra o novo preço
sabendo-se que este sofreu um desconto de 10%.*/

public class Exercicio10 {
    public static void main(String[] args)
    {
        Double precoProduto, reajuste;

        precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));

        reajuste = precoProduto * 0.10;
        reajuste = precoProduto - reajuste;

        JOptionPane.showMessageDialog(null, "O preço bruto do produto é " + precoProduto + ". Porém, esse produto sofreu um reajuste de 10% de desconto." + "\n" + 
                                            "Esse produto com o reajuste é: " + reajuste);
    }
}

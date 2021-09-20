import javax.swing.JOptionPane;

/*12. Fazer um programa que recebe o salário de um funcionário e o percentual de aumento,
calcula e mostra o valor do aumento e o novo salário.*/

public class Exercicio12 {
    public static void main(String[] args)
    {
        Double salario, porcentagemReajuste, salarioReajuste, valorReajuste;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário: "));
        porcentagemReajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de reajuste que será acrescentado ao salário: "));

        valorReajuste = (porcentagemReajuste / 100) * salario;

        salarioReajuste = salario + valorReajuste;

        JOptionPane.showMessageDialog(null, "O valor de reajuste que será acrescentado é: R$" + valorReajuste + "\n" + 
                                            "O salário com reajuste do funcionário é: R$" + salarioReajuste);
    }
}

import javax.swing.JOptionPane;

/*11. Fazer um programa que recebe o salário-base de um funcionário, calcula e mostra o salário
a receber, sabendo-se que esse funcionário tem gratificação de 5% sobre o salário-base e paga
imposto de 7% sobre o salário-base.*/

public class Exercicio11 {
    public static void main(String[] args)
    {
        Double salarioBase, salarioImposto, salarioGratificacao, salarioLiquido;

        salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base do funcionário: "));

        salarioImposto = salarioBase * 0.07;
        salarioGratificacao = salarioBase + (salarioBase * 0.05);

        salarioLiquido = salarioBase + salarioImposto + salarioGratificacao;

        JOptionPane.showMessageDialog(null, "O salário a receber desse funcionário é: " + salarioLiquido);
    }
}

import javax.swing.JOptionPane;

public class SalarioFuncionario {
    public static void main (String[] args)
    {
        Double salario, reajuste;
        Double intervalo;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário mensal do funcionário: "));
        reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de reajuste sem símbolos: "));

        reajuste = reajuste / 100;
        intervalo = salario;
        intervalo = intervalo * reajuste;
        salario = salario - intervalo;

        JOptionPane.showMessageDialog(null, "O salário com reajuste do funcionário é: R$" + salario);
    }
}
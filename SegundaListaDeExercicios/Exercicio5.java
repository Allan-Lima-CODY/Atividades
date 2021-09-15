import javax.swing.JOptionPane;

/*5. Fazer um programa que recebe três números inteiros, calcula e mostra a soma desses
números.*/

public class Exercicio5 {
    public static void main(String[] args)
    {
        int num, num1, num2, result;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));

        result = num + num1 + num2;

        JOptionPane.showMessageDialog(null, "O resultado é: " + result);
    }
}

import javax.swing.JOptionPane;

/*7. Fazer um programa que calcula e mostra a área de um triângulo, sabendo que:
área = (base * altura) / 2.*/

public class Exercicio7 {
    public static void main(String[] args)
    {
        Double base, altura, area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do trângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));

        area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
}

import javax.swing.JOptionPane;

/*6. Fazer um programa que recebe três notas, calcula e mostra a média aritmética dessas notas.*/

public class Exercicio6 {
    public static void main(String[] args)
    {
        Double nota1, nota2, nota3, media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

        media = (nota1 + nota2 + nota3) / 3;

        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
}

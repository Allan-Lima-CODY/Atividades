import javax.swing.JOptionPane;

/*8. Fazer um programa que calcula e mostra a área de um círculo, sabendo que:
área = pi * r
2.*/

public class Exercicio8 {
    public static void main(String[] args)
    {
        Double pi = 3.14, diametro, raio, area;

        diametro = Double.parseDouble(JOptionPane.showInputDialog("Digite o diâmetro do triângulo: "));

        raio = diametro / 2;
        area = pi * (Math.pow(raio, 2));

        JOptionPane.showMessageDialog(null, "A área de círculo é: " + area);
    }
}

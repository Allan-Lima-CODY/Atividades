import javax.swing.JOptionPane;

/*4. Tendo como dados de entrada a altura (h) e o sexo de uma pessoa (um caracter m ou f),
construir um programa que calcula seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7*/

public class Exercicio4 {
    public static void main(String[] args)
    {
        Double h;
        String sexo = "";

        h = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do indivíduo: "));
        sexo = JOptionPane.showInputDialog("Digite o sexo do indivíduo. (M para Masculino e F para Feminino): ");

        if (sexo == "M")
        {
            Double pesoIdeal = (72.7 * h) - 58;
            JOptionPane.showMessageDialog(null, "O peso ideal para essa pessoa é: " + pesoIdeal);
        }
        
        else if (sexo == "F")
        {
            Double pesoIdeal = (62.1 * h) - 44.7;
            JOptionPane.showMessageDialog(null, "O peso ideal para essa pessoa é: " + pesoIdeal);
        }

        else 
        {
            JOptionPane.showMessageDialog(null, "Sexo inexistente!");
        }
    }
}

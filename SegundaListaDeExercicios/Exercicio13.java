import javax.swing.JOptionPane;

/*13. A nota final de um estudante é calculada a partir de três notas atribuídas respectivamente
a um trabalho de laboratório, à avaliação semestral e a um exame final. A média das três notas
mencionadas anteriormente obedece aos pesos a seguir:
NOTA                     PESO
Trabalho de laboratório  2
Avaliação semestral      3
Exame final              5*/

public class Exercicio13 {
    public static void main(String[] args)
    {
        Double tl, as, ef, media;

        tl = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho de laboratório: "));
        as = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da avaliação semestral: "));
        ef = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do exame final: "));

        tl = tl * 0.2;
        as = as * 0.3;
        ef = ef * 0.5;

        media = tl + as + ef;

        JOptionPane.showMessageDialog(null, "A média do aluno é: " + media);
    }
}

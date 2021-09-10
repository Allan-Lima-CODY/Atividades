import javax.swing.JOptionPane;

public class Aprovacao {
    public static void main(String[] args)
    {
        Double nota, qtdAulas, qtdParticipacao;
        
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno: "));
        qtdAulas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de aulas que foram dadas: "));
        qtdParticipacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantas aulas o aluno participou: "));

        if ((nota >= 70) && (qtdParticipacao >= qtdAulas * 0.25))
        {
            JOptionPane.showMessageDialog(null, "Aprovado. Parabéns!");
        }

        else
        {
            if ((nota >= 70) && (qtdParticipacao < qtdAulas * 0.25))
            {
                JOptionPane.showMessageDialog(null, "Aprovado. Parabéns!");
            }
            
            else if ((nota >= 40) && (nota < 70) && (qtdParticipacao < qtdAulas * 0.25) || (qtdParticipacao >= qtdAulas * 0.25))
            {
                JOptionPane.showMessageDialog(null, "Infelizmente o aluno terá que fazer uma prova complementar!");
            }

            else 
            {
                JOptionPane.showMessageDialog(null, "Reprovado!");
            }
        }
    }
}
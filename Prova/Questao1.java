import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Questao1 {
    public static void main(String[] args)
    {
        int mobileA = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso do primeiro móbile A: "));
        int mobileB = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso do primeiro móbile B: "));
        int mobileC = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso do primeiro móbile c: "));
        int mobileD = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso do primeiro móbile D: "));

        if ((mobileA == mobileB + mobileC + mobileD) && (mobileD == mobileB + mobileC) && (mobileB == mobileC))
        {
            JOptionPane.showMessageDialog(null, "S");
        }

        else
        {
            JOptionPane.showMessageDialog(null, "N");
        }
    }
}
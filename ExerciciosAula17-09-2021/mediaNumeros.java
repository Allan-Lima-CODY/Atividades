import javax.swing.JOptionPane;

public class mediaNumeros {
    public static void main(String[] args) {
        String op; 
        double soma = 0, media = 0; 
        int cont = 0; 

        do { 
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota: "));
          
            if (nota >= 0) 
            { 
                soma = soma + nota; 
                cont++; 
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Digite uma nota válida!!!"); 
            }
          
            op = JOptionPane.showInputDialog("Deseja digitar outra nota? \n S ou Sim \n N ou Não"); 
        } while (op.equalsIgnoreCase("s") || op.equalsIgnoreCase("Sim"));
          
        media = soma / cont;
          
        JOptionPane.showMessageDialog(null, "A média das notas digitas é: " + media);
    }
}
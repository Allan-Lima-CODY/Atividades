import javax.swing.JOptionPane;

public class entreCemeDuzentos {
    public static void main(String[] args) {
        double op = -1; 
        int cont = 0;
        while (op != 0) { 
            op = Double.parseDouble(JOptionPane.showInputDialog("Digite um número qualquer ou 0 para sair")); 
            if (op >= 100 && op <= 200) 
            { 
                cont++; 
            } 
        } 
        JOptionPane.showMessageDialog(null, "Foram lidos " + cont + " números entre 100 e 200");
    }
}
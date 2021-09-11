import javax.swing.JOptionPane;

public class Voto {
    public static void main (String[] args)
    {
        int moradores; 
        Double vtBrancos, vtNulos, vtValidos;

        moradores = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moradores: "));
        vtBrancos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos brancos: "));
        vtNulos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos nulos: "));
        vtValidos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos válidos: "));

        vtBrancos = (vtBrancos * 100) / moradores;
        vtNulos = (vtNulos * 100) / moradores;
        vtValidos = (vtValidos * 100) / moradores;

        JOptionPane.showMessageDialog(null, "A quantidade de moradores é : " + moradores + "\n" + "A porcentagem de votos brancos é: " +
                                            vtBrancos + "%" + "\n" + "A porcentagem de votos nulos é: " + vtNulos + "%" + "\n" + 
                                            "A porcentagem de votos válidos é: " + vtValidos + "%");                                 
    }
}
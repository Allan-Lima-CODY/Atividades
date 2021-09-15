import javax.swing.JOptionPane;

/*9. Fazer um programa que recebe um número positivo, calcula e mostra:
a) O número digitado ao quadrado;
b) O número digitado ao cubo;
c) A raiz quadrada do número digitado.*/

public class Exercicio9 {
    public static void main(String[] args)
    {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (numero >= 0)
        {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é positivo." + "\n" +
                                                "O quadrado desse número é: " + Math.pow(numero, 2) + "." + "\n" + 
                                                "O cubo desse número é: " + Math.pow(numero, 3) + "." + "\n" + 
                                                "A raiz quadrada desse número é: " + Math.sqrt(numero) + ".");
        }

        else 
        {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é positivo.");
        }
    }
}

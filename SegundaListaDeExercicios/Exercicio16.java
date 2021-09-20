import javax.swing.JOptionPane;

/*16. Fazer um programa que recebe três números inteiros em ordem crescente e um quarto
número também inteiro que não siga esta regra. Mostra, em seguida, os quatro números em
ordem crescente.*/

public class Exercicio16 {
    public static void main(String[] args)
    {
        int a, b, c, d;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor. (Tem que ser o menor da lista): "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor. (Tem que ser maior que o primeiro valor e menor que o próximo): "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor. (Tem que ser maior que o anterior): "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor. (Esse, você poderá escolher qualquer número): "));

        if ((a < b) && (a < c) && (b > a) && (b < c) && (c > a) && (c > b))
        {
            if(d < a)
            {
                System.out.println(d + ", " + a + ", " + b + ", " + c);
            }
            else if ((d >= a) && (d < b))
            {
                System.out.println(a + ", " + d + ", " + b + ", " + c);
            }
            else if ((d >= b) && (d < c))
            {
                System.out.println(a + ", " + b + ", " + d + ", " + c);
            }
            else if (d >= c)
            {
                System.out.println(a + ", " + b + ", " + c + ", " + d);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Você não seguiu as instruções! Tente novamente.");
        }
    }
}

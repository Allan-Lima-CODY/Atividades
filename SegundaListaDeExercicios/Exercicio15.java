import javax.swing.JOptionPane;

/*15. Fazer um programa que recebe três números e mostra-os em ordem crescente.*/

public class Exercicio15 {
    public static void main(String[] args)
    {
        int a, b, c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));

        if ((a > b) && (a > c) && (b > c))
        {
            System.out.println(c + ", " + b + ", " + a);
        }

        else if ((a > b) && (a > c) && (c > b))
        {
            System.out.println(b + ", " + c + ", " + a);
        }

        else if ((b > a) && (b > c) && (a > c))
        {
            System.out.println(c + ", " + a + ", " + b);
        }

        else if ((b > a) && (b > c) && (c > a))
        {
            System.out.println(a + ", " + c + ", " + b);
        }

        else if ((c > a) && (c > b) && (a > b))
        {
            System.out.println(b + ", " + a + ", " + c);
        }

        else
        {
            System.out.println(a + ", " + b + ", " + c);
        }
    }
}

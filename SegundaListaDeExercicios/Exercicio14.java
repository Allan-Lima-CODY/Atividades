import javax.swing.JOptionPane;

/*14. Fazer um programa que recebe dois números e mostra o maior.*/

public class Exercicio14 {
    public static void main(String[] args)
    {
        int a, b;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

        if (a > b)
        {
            System.out.println(a);
        }

        else if (b > a)
        {
            System.out.println(b);
        }

        else 
        {
            System.out.println("Os valores são iguais.");
        }
    }
}

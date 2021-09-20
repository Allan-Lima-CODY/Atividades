import javax.swing.JOptionPane;

/*24. Ler um número inteiro entre 1 e 20 e exibir sua tabuada. Utilize os 3 comandos de laço de
repetição, para praticar.*/

public class Exercicio24 {
    public static void main(String[] args)
    {
        int num = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if ((num >= 1) && (num <= 20))
        {
            for(int i = 1; i <= 10; i++)
            {
                int result = i * num;
                System.out.println(i + " x " + num + " = " + result);
            }
        }
    }
}

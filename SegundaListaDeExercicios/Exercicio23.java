import javax.swing.JOptionPane;

/*23. Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado
daquele tamanho com asteriscos. Seu programa deve funcionar para quadrados com lados de
todos os tamanhos entre 1 e 20. Exemplo para lado igual a 5:
*****
*****
*****
***** */

public class Exercicio23 {
    public static void main(String[] args)
    {
        int recebe;
        recebe = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do lado do quadrado: "));
      
        for(int x = 4; x > 0; x--)
        {
            for(int y = recebe; y > 0; y--)
                {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}

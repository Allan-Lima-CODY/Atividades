import javax.swing.JOptionPane;

/*20. Usando switch-case, escrever um programa que lê um inteiro entre 1 e 7 e exibe o dia da
semana correspondente a esse número. Isto é, domingo se 1, segunda-feira se 2, e assim por
diante.*/

public class Exercicio20 {
    public static void main(String[] args)
    {
        int diaSemana;

        diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia da semana como número: "));

        switch(diaSemana)
        {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sabádo"); break;
            default: System.out.println("Dia da semana inválido!"); break;
        }
    }
}

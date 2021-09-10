import javax.swing.JOptionPane;

public class TabuadaNove {
    public static void main (String[] args)
    {
        int nove = 9, resultado;

        for (int mult = 0; mult <= 10; mult++)
        {
            resultado = nove * mult;

            System.out.println(nove + " x " + mult + " = " + resultado);
        }
    }
}
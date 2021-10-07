import java.util.Scanner;

public class CDs {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int qtdCDs, contador = 0;
        double mediaValor = 0, valorTotal = 0, valorCDs = 0;

        System.out.println("Informe a quantidade de CDs: ");
        qtdCDs = entrada.nextInt();

        do {
            System.out.println("Informe o valor para o CD: ");
            valorCDs = entrada.nextDouble();

            valorTotal = valorTotal + valorCDs;

            contador++;
    
        } while (contador < qtdCDs);

        System.out.println("O valor total da coleção desse colecionador é: " + valorTotal);

        mediaValor = valorTotal / qtdCDs;

        System.out.println("A média do valor para cada CD é: " + mediaValor);
    }
}
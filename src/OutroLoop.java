import java.util.Scanner;

public class OutroLoop {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avalicao para o filme ou - 1 para encerrar: ");
            nota = scanner.nextDouble();

            if ( nota != -1) {
                media += nota;
                totalDeNotas++;
            } else {
                System.out.println("obrigado por usar o programa!");
            }
        }
        System.out.println("Media de avaliacoes do filme foi de: " + media/3);
    }
}

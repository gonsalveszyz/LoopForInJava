import java.util.Scanner;

public class Leitura {
    static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite seu filme favorito: ");
        String filme = scanner.nextLine();
            System.out.println("Qual o ano de lancamento do seu filme favorito?");
        int anoDeLancameento = scanner.nextInt();
            System.out.println("Digite sua avaliacao para o filme: ");
        double avaliacao = scanner.nextDouble();

            System.out.println(filme);
            System.out.println(anoDeLancameento);
            System.out.println(avaliacao);

    }
}
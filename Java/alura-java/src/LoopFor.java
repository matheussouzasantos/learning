import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliacao para o filme ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        String mediaFinal = String.format("%.1f", mediaAvaliacao/3);
        System.out.println("Média de avaliacoes" + mediaFinal);
    }
}

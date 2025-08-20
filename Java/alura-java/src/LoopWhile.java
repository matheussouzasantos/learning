import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliacao para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
            if (nota == -1) {
                System.out.println("Voce está saiu da avaliacao.");
            }
        }


        String mediaFinal = String.format("%.1f", mediaAvaliacao / totalDeNotas);
        System.out.println("Média de avaliacoes" + mediaFinal);
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média das notas
        double mediaDeNotas = (9.8 + 6.3 + 8.0) /3;
        System.out.println(mediaDeNotas);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme com gala dos anos 80
                Muito bom!
                Ano de lancamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int estrelas = (int) (mediaDeNotas /2);
        System.out.println("Esse filme ganhou " + estrelas + " estrelas!");
    }
}
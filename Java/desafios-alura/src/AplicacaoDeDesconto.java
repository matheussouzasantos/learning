package DesafiosAlura.src;

public class AplicacaoDeDesconto {
    public static void main(String[] args){
        // considere 1 dolar = 5,50 reais
        double precoOriginal = 49.90;
        double percentualDeDesconto = 10;

        double aplicandoDesconto = (precoOriginal * percentualDeDesconto)/100;
        double valorFinal = precoOriginal - aplicandoDesconto;
        String valorFinalFormatado = String.format("%.2f", valorFinal);

        System.out.println("O valor sem desconto é: " + precoOriginal);
        System.out.println("O desconto dado será de: " + percentualDeDesconto +"%");
        System.out.println("O valor com desconto é: " + valorFinalFormatado);
    }
}

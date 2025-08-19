package DesafiosAlura.src;

public class IntMultiplicandoDouble {
    public static void main(String[] args){
        double precoProduto = 19.90;
        int quantidade = 5;
        double valorTotal = precoProduto * quantidade;
        String valorTotalFormatado = String.format("%.2f", valorTotal);

        System.out.println("O valor a ser pago é: " + valorTotalFormatado);

    }
}

package DesafiosAlura;

public class ConversaoDeTemperatura {
    public static void main(String[] args){
        int celsius = 33;
        int fahrenheit = (int) ((celsius * 1.8) + 32);
        System.out.println("A temperatura em celsius é: " + celsius);
        System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
    }
}

package ex2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("informe um número:");
        double numero= ler.nextDouble();
        calculadora  minhaCalculadora=new calculadora();
        double resultado= minhaCalculadora.calculaDobro(numero);
        System.out.println("O dobro é:"+resultado);


    }
}

package exe10;

import java.util.Scanner;

public class Triangulo {
        double base;
        double altura;
        double area;

        public void informacoes() {
            System.out.println("base:" + base);
            System.out.println("altura:" + altura);
            area = base * altura;
            System.out.println("área: " + area);
        }

        public void calcularAreadoTriangulo() {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite a base do  triângulo:");
            base = ler.nextDouble();
            System.out.println("digite a altura do  triângulo:");
            altura = ler.nextDouble();
        }
    }



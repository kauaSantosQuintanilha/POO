package exe06;

import java.util.Scanner;

public class Retangulo {
    double base;
    double altura;
    double area;

    public  void informacoes(){
        System.out.println("base:"+base);
        System.out.println("altura:"+altura);
        area=base*altura;
        System.out.println("área: "+area);

    }
    public void  calcularAreadoRetangulo(){
        Scanner ler=new Scanner(System.in);
        System.out.println("Digite a base do  retângulo:");
        base= ler.nextDouble();
        System.out.println("digite a altura do  retângulo:");
        altura= ler.nextDouble();
    }
}

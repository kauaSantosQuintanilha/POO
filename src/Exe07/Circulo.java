package Exe07;

import java.util.Scanner;

public class Circulo {
    double raiodocirculo;
    double areadoCirculo;
    double perimentrodoCirculo;

    public  void informacoes(){
        System.out.println("raio do circulo:"+raiodocirculo);
        areadoCirculo=Math.PI*Math.pow(raiodocirculo,2);
        System.out.println("área do circulo: "+areadoCirculo);
        perimentrodoCirculo=2*Math.PI*raiodocirculo;
        System.out.println("perimentro do Circulo:"+perimentrodoCirculo);

    }
    public void calcularAreaePerimentro(){
        Scanner ler=new Scanner(System.in);
        System.out.println("digite o raio do circulo:");
        raiodocirculo= ler.nextDouble();
    }

}

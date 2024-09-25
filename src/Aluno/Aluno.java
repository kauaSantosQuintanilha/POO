package Aluno;

import java.util.Scanner;

public class Aluno {

    private  String nome;
    private Double nota1;
    private  double nota2;
    private double nota3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public void calcularMedia(){
        double media;
        Scanner ler=new Scanner(System.in);
        System.out.println("nota1:");
        nota1= ler.nextDouble();
        System.out.println("nota2:");
        nota2= ler.nextDouble();
        System.out.println("nota3:");
        nota3= ler.nextDouble();
        media=(nota1+nota2+nota3)/3;
        System.out.println("sua media é:"+media);

    }
}


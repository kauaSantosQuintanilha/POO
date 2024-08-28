package Carro;

import java.util.Scanner;

public class Carro {
    String nome;
    String marca;
    String modelo;
    int ano;
    //funções da classe Carro.Carro,aço~es do carro

    public void ligarCarro(){
        System.out.println("Carro ligado!!!");

    }
    public void imprimirDados() {
        // imprimir todos os dados do filme
        System.out.println("Nome:" + nome);
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano:" + ano);



    }
    public  void lerDados(){
        Scanner leia=new Scanner(System.in);
        System.out.println("--------------\n");
        System.out.println("digite o nome do carro:");
        nome=leia.nextLine();
        System.out.println("digite a marca do carro:");
        marca=leia.next();
        System.out.println("digite o modelo:");
        modelo=leia.next();
        System.out.println("digite o ano:");
        ano=leia.nextInt();

    }
}

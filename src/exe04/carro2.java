package exe04;

import java.util.Scanner;

public class carro2 {
    String nome;
    String modelo;
    int anodefabricacao;
    String cor;
    double idadedocarro;
    double anoAtual;

    public void ligarCarro(){


    }
    public void fichaTecnica() {
        // imprimir todos os dados do filme
        System.out.println("Nome:" + nome);
        System.out.println("modelo:" + modelo);
        System.out.println("ano:" +anodefabricacao);
        System.out.println("cor:" + cor);
        idadedocarro=anoAtual-anodefabricacao;
        System.out.println("a idade do carro é:"+idadedocarro+" anos");




    }
    public  void calcularIdadedoCarro(){
        Scanner leia=new Scanner(System.in);
        System.out.println("--------------\n");
        System.out.println("digite o nome do carro:");
        nome=leia.nextLine();
        System.out.println("digite o modelo do carro:");
        modelo =leia.next();
        System.out.println("digite o ano do carro:");
        anodefabricacao=leia.nextInt();
        System.out.println("digite a cor :");
        cor = leia.next();
        System.out.println("digite o ano atual:");
        anoAtual= leia.nextDouble();

    }
}


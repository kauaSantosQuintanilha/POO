package exe04;

import java.util.Scanner;

public class carro2 {
    String nome;
    String modelo;
    int ano;
    String cor;
    double idadedocarro;

    public void ligarCarro(){
        System.out.println("Carro ligado!!!");

    }
    public void fichaTecnica() {
        // imprimir todos os dados do filme
        System.out.println("Nome:" + nome);
        System.out.println("modelo:" + modelo);
        System.out.println("ano:" + ano);
        System.out.println("cor:" + cor);
        idadedocarro=2024-ano;
        System.out.println("a idade do carro é:"+idadedocarro);




    }
    public  void lerDados(){
        Scanner leia=new Scanner(System.in);
        System.out.println("--------------\n");
        System.out.println("digite o nome do carro:");
        nome=leia.nextLine();
        System.out.println("digite o modelo do carro:");
        modelo =leia.next();
        System.out.println("digite o ano:");
        ano=leia.nextInt();
        System.out.println("digite a cor :");
        cor = leia.next();

    }
}


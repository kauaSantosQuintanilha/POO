package exe03;

import java.util.Scanner;

public class Musica {
    String musica;
    String titulomusica;
    String artista;
    int anolancamento;
    double avaliacao;
    double numAvaliacao;
    double media;

    public void imprimirDados(){
        System.out.println("titulo da música:"+titulomusica);
        System.out.println("artista da música:"+artista);
        System.out.println("ano de lancamento"+anolancamento);
        System.out.println("avaliação"+avaliacao);
        System.out.println("numero de avaliação:"+numAvaliacao);
        System.out.println("média da avaliacao"+media);

    }
    public  void lerDados(){
        Scanner leia=new Scanner(System.in);
        System.out.println("--------------\n");
        System.out.println("digite o titulo da música:");
        titulomusica=leia.nextLine();
        System.out.println("digite o artista da música:");
        artista=leia.next();
        System.out.println("digite o ano de lancamento:");
        anolancamento =leia.nextInt();
        System.out.println("digite a avaliacao da música:");
        avaliacao= leia.nextDouble();
        System.out.println("digite numeros de avaliacões da musica:");
        numAvaliacao= leia.nextDouble();
    }
}


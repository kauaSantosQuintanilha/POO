package exe03;

import java.util.Scanner;

public class Musica {
    String musica;
    String titulomusica;
    String artista;
    int anolancamento;
    double avaliacao;
    double numAvaliacao;
    double somatoriodeAvaliacoes;
    double media;


    public void exibirFichaTecnica(){
        System.out.println("titulo da música:"+titulomusica);
        System.out.println("artista da música:"+artista);
        System.out.println("ano de lancamento"+anolancamento);
        System.out.println("avaliação"+avaliacao);
        System.out.println("numero de avaliação:"+numAvaliacao);
        System.out.println("média:"+media);


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
       atualizamedia(avaliacao);
    }
    public  void  atualizamedia(double avaliacao){
        numAvaliacao++;
        somatoriodeAvaliacoes=somatoriodeAvaliacoes + avaliacao;
        media=somatoriodeAvaliacoes/numAvaliacao;

}
}


package exe09;

import java.util.Scanner;

public class Livro {
  String titulo;
  String autor;
  int paginas;
  int anoPublicacao;

  public  void informacoes(){
      System.out.println("titulo:"+titulo);
      System.out.println("autor:"+autor);
      System.out.println("paginas:"+paginas);
      System.out.println("ano de publicacao:"+anoPublicacao);

  }
  public  void exibir(){
      Scanner ler= new Scanner(System.in);
      System.out.println("Qual o titulo do livro:");
      titulo=ler.next();
      System.out.println("Qual o nome do autor do livro:");
      autor= ler.next();
      System.out.println("Quantas paginas tem?");
      paginas= ler.nextInt();
      System.out.println("Ano de publicação:");
      anoPublicacao= ler.nextInt();
  }

}

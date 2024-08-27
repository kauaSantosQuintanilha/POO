import java.util.Scanner;

public class Filme {
        //Atributos da classe
        String nome;
        String classificacao;
        String genero;
        boolean icluidoNoPlano;
        int duracaoEmMinuntos;

        //Metodo imprimir dados do filme sem retorno void
        public void imprimirDados() {
                // imprimir todos os dados do filme
                System.out.println("Filme:" + nome);
                System.out.println("Duracao:" + duracaoEmMinuntos + " minuntos");
                System.out.println("Classificação:" + classificacao);
                System.out.println("genero:" + genero);
                System.out.println("Incluso no Plano:" + icluidoNoPlano);


        }
      public  void lerDados(){
              Scanner leia=new Scanner(System.in);
                System.out.println("--------------\n");
              System.out.println("digite o nome do filme:");
              nome=leia.nextLine();
              System.out.println("digite duração do filme:");
              duracaoEmMinuntos=leia.nextInt();
              System.out.println("digite a classificação:");
              classificacao=leia.next();
              System.out.println("digite o genero:");
              genero=leia.next();
              System.out.println("está incluso no plano ?(true ou false):");
              icluidoNoPlano=leia.nextBoolean();
      }
    }



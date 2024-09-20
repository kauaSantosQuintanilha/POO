package avaliacao;

import java.util.Scanner;

public class Carro {
    String modelo;
    int anodeFabricacao;
    String cor;
      public void mostrarDetalhes(){
          Scanner ler=new Scanner(System.in);
          System.out.println("modelo:"+modelo);
          System.out.println("anodefabricacao:"+anodeFabricacao);
          System.out.println("cor:"+cor);
      }

}

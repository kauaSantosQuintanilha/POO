package Carro;

public class Main {
    public static void main(String[] args) {
        //Criar objeto Carro--> meuCarro
        // Tipo nomedoObjeto=new Tipo();
        Carro meuCarro = new Carro();
        meuCarro.lerDados();
        System.out.println("\n ******dados do filme******");
        meuCarro.imprimirDados();
        meuCarro.ligarCarro();
    }
}

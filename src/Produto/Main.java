package Produto;

public class Main {
    public static void main(String[] args) {
        Produto promocao = new Produto();
       promocao.setPreco(20.00);
       promocao.aplicarDesconto(15.0);
       System.out.println("preco com desconto:"+promocao.getPreco());
    }
}
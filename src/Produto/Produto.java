package Produto;

public class Produto {
  private  String nome;
  private Double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public void aplicarDesconto(double percentual){
        this.preco=this.preco-this.preco*(percentual/100);
    }
}

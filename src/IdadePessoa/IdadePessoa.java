package IdadePessoa;

import java.util.Scanner;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade() {
        this.idade = idade;

    } public void verificarIdade(){
        Scanner ler = new Scanner(System.in);
        System.out.println("digite seu nome:");
        nome= ler.next();
        System.out.println("Digite sua idade:");
        idade= ler.nextInt();
        if (this.idade>=18){
                    System.out.println("maior de idade");
                }else {
                    System.out.println("menor de idade");
            }

    }

}

package Livro2;

import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
     Scanner ler=new Scanner(System.in);
        System.out.println("titulo:");
        titulo= ler.next();
        System.out.println("autor:");
        autor= ler.next();
        System.out.println("titulo"+titulo);
        System.out.println("autor"+titulo);

    }
}
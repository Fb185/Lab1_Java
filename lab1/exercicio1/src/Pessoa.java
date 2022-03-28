package exercicio1;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String genero;
    private int idade;

    public Pessoa(){}
    public Pessoa(String n, String g){
        this.nome = n;
        this.genero = g;
    }
    public Pessoa (String n, String g, int i){
        this(n,g); // usa o construtor anterior
        this.idade = i;
    }
    public void falar(){
        System.out.println(" Ola ");

    }

    public  void setNome(String name) {
        this.nome = name;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return this.genero;
    }
    public int getIdade() {
        return this.idade;
    }
    public String getNome() {
        return this.nome;
    }
}


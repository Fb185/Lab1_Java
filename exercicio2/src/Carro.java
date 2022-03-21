public class Carro{
    private String matricula;
    private int velocidadeAtual = 0;
    int velocidadeMaxima = 200;


    void ligar() { System.out.println("VROOOM"); }
    void desligar() { System.out.println("MMMmmmmm"); }
    void acelerar() { velocidadeAtual += 10;
        if (velocidadeAtual > velocidadeMaxima) velocidadeAtual = velocidadeMaxima; }
    void travar(int intensidadeTravagem){
        if (intensidadeTravagem > velocidadeMaxima) intensidadeTravagem = velocidadeMaxima;
        else if (intensidadeTravagem < 0) intensidadeTravagem = 0;
        velocidadeAtual -= intensidadeTravagem;
        if (velocidadeAtual > velocidadeMaxima) velocidadeAtual = velocidadeMaxima;
        else if (velocidadeAtual < 0) velocidadeAtual = 0; }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }
}

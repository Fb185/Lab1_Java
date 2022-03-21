public class Corrida {
    public Corrida(){}

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.setMatricula("11-AA-11");
        carro2.setMatricula("22-BB-22");


        Condutor condutor1 = new Condutor();
        Condutor condutor2 = new Condutor();
        condutor1.setNome("Antonio");
        condutor1.setIdade(25);
        condutor1.setDestreza(75);
        condutor2.setNome("manuel");
        condutor2.setIdade(27);
        condutor2.setDestreza(67);

        carro1.ligar();
        carro2.ligar();

        carro1.acelerar();
        carro2.acelerar();
        carro1.acelerar();
        carro2.travar(10);
        carro1.acelerar();
        carro1.acelerar();
        carro1.travar(5);
        carro2.acelerar();

        System.out.println("Velocidade do carro 1: " + carro1.getVelocidadeAtual());
        System.out.println("Velocidade do carro 2: " + carro2.getVelocidadeAtual());


        carro1.desligar();
        carro2.desligar();

    }
}

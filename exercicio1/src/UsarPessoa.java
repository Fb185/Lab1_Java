import java.util.Scanner;
public class UsarPessoa {
    //constritor default para obkectos da classe
    //UsaPessoa este construtor existe mesmo se nao for explicictamente declarado

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        exercicio1.Pessoa pessoa1;
        exercicio1.Pessoa pessoa2;
        pessoa1 = new exercicio1.Pessoa();
        pessoa1.setNome("Camila");
        pessoa1.setGenero("F");
        pessoa1.setIdade(12);
        System.out.println("O objecto pessoa chama-se "+pessoa1.getNome()+", e do sexo "+pessoa1.getGenero()+", tem "+pessoa1.getIdade()+" anos e diz: ");

        pessoa1.falar();

        pessoa2 = new exercicio1.Pessoa();
        System.out.println("introduza nome: ");
        String nome = myObj.nextLine();
        System.out.println("introduza genero: ");
        String genero = myObj.nextLine();
        System.out.println("introduza idade: ");
        int idade = myObj.nextInt();
        pessoa2.setNome(nome);
        pessoa2.setGenero(genero);
        pessoa2.setIdade(idade);
        System.out.println("O objecto pessoa chama-se "+pessoa2.getNome()+", e do sexo"+
                pessoa2.getGenero()+", tem "+pessoa2.getIdade()+" anos e diz: ");


    }
}

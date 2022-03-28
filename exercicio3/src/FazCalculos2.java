import java.util.Scanner;
public class FazCalculos2 extends Calculadora {
    Calculadora calc = new Calculadora();
    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza o primeiro numero:\n");
        int num1 = sc.nextInt();
        System.out.println("Introduza o segundo numero:\n");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2);
        calc.add(num1, num2);
        System.out.println(num1 + " - " + num2);
        calc.sub(num1, num2);
        System.out.println(num1 + " * " + num2);
        calc.mult(num1, num2);
        System.out.println(num1 + " / " + num2);
        calc.div(num1, num2);
        sc.close();
    }
}

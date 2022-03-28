import java.util.Scanner;
public class FazCalculos2 extends Calculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza o primeiro numero:\n");
        double num1 = sc.nextDouble();
        System.out.println("Introduza o segundo numero:\n");
        double num2 = sc.nextDouble();

        System.out.println(num1 + " + " + num2+ " = "+ calc.add(num1, num2));
        System.out.println(num1 + " - " + num2+ " = "+ calc.sub(num1, num2));
        System.out.println(num1 + " * " + num2+ " = "+ calc.mult(num1, num2));
        System.out.println(num1 + " / " + num2+ " = "+ calc.div(num1, num2));
        sc.close();
    }
}

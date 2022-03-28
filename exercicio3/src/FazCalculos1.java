public class FazCalculos1 extends Calculadora{

    public static void main(String args[]){
        Calculadora calc = new Calculadora();
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Introduza o primeiro numero:\n");
        //int num1 = sc.nextInt();
        //System.out.println("Introduza o segundo numero:\n");
        //int num2 = sc.nextInt();
        double num1 = 2.7;
        double num2 = 5.2;

        System.out.println(num1 + " + " + num2+ " = "+ calc.add(num1, num2));
        System.out.println(num1 + " - " + num2+ " = "+ calc.sub(num1, num2));
        System.out.println(num1 + " * " + num2+ " = "+ calc.mult(num1, num2));
        System.out.println(num1 + " / " + num2+ " = "+ calc.div(num1, num2));


    }
}

package overload;

public class CalcMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1, 2, 4));
        System.out.println(calculator.sum(1.1f, 2.0f));
    }
}

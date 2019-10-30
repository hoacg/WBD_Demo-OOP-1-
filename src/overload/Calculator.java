package overload;

public class Calculator {

    public int sum(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    public int sum(float firstOperand, float secondOperand) {
        return 0;
    }

    public int sum(int firstOperand, int secondOperand, int thirdOperand) {
        return firstOperand + secondOperand + thirdOperand;
    }
}

package overload;

public class Calculator {

    public int sum(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    public int sum(int firstOperand, int secondOperand, int thirdOperand) {
        return firstOperand + secondOperand + thirdOperand;
    }
}

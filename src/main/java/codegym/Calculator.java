package codegym;

public class Calculator {
    public static double calculate(double firstNumber, double secondNumber,String operator){
        switch (operator){
            case "add": return firstNumber + secondNumber;
            case "mul": return firstNumber * secondNumber;
            case "sub": return  firstNumber-secondNumber;
            case "div": if(secondNumber != 0) return  firstNumber/secondNumber; else{
                throw new RuntimeException("Can't divide by zero");
            }
            default: throw new RuntimeException("Invalid Operation");
        }
    }
    public static String getOperator(String operator){
        switch (operator){
            case "add": return "+";
            case "mul": return "*";
            case "sub": return "-";
            case "div": return "/";
            default: throw new RuntimeException("Invalid Operation");
        }
    }
}

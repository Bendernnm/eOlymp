package nnm.bender.lambda;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = () -> 2;
        System.out.println(myInterface.getValue());
        LambdaParameter lambdaParameter = (n) -> n * 2;
        System.out.println(lambdaParameter.getValue(2));
        InterfaceFactorial interfaceFactorial = (n) -> {
            int factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        };
        System.out.println("2: "+interfaceFactorial.calculateFactorial(2));
        System.out.println("3: "+interfaceFactorial.calculateFactorial(3));
        System.out.println("4: "+interfaceFactorial.calculateFactorial(4));
        System.out.println("5: "+interfaceFactorial.calculateFactorial(5));

        UnaryOperator<Integer> integerUnaryOperator = (n)->n*5;
        Integer everFive = 25;
        System.out.println(integerUnaryOperator.apply(everFive));
    }
}

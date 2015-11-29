package nnm.bender.kurs;

import java.util.function.DoubleUnaryOperator;

public class integralKurs {

    public static void main(String[] args) {
        double a = integrate(new DoubleUnaryOperator() {
            @Override
            public double applyAsDouble(double operand) {
                return 1+operand;
            }
        }, 0, 10);
        int b = (int) a;
        System.out.println(b);
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double step = Math.pow(10, -6);
        double summ = 0;
        while (a <= b) {
            summ += f.applyAsDouble(a) * (step);
            a += step;
        }
        return summ;
    }
}

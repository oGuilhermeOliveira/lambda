package br.com.guilhermeoli.lambdas;

import java.util.function.IntBinaryOperator;

/**
 * @author guiol
 */
public class IntBinaryOperatorClass implements IntBinaryOperator {

    @Override
    public int applyAsInt(int a, int b) {
        return a + b;
    }
}

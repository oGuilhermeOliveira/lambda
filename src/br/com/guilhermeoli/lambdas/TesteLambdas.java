package br.com.guilhermeoli.lambdas;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;

/**
 * @author guiol
 */
public class TesteLambdas {

    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };
        intBinaryOperator.applyAsInt(1, 1);

        IntBinaryOperator ope = new IntBinaryOperatorClass();
        int result1 = ope.applyAsInt(1, 1);
        System.out.println(result1);

        BiFunction<Integer, Integer, Integer> biFunctions = (Integer a, Integer b) -> {
            return a + b;
        };
        Integer resultbi = biFunctions.apply(10 , 10);
        System.out.println(resultbi);

        BiFunction<Double, Double, String> biFunctionsStr = (Double a, Double b) -> {
            Double re = a + b;
            return String.valueOf(re);
        };
        String biFunctionsStrs = biFunctionsStr.apply(10d , 10d);
        System.out.println("String " + biFunctionsStrs);

        Long returnLong =  calcular(1L , 2L, (Long v1, Long v2) -> {
            return v1 + v2;
        });
        System.out.println(returnLong);

        Runnable hello_world = () -> System.out.println("Hello World");
        Consumer<String> stringConsumer = (String s) -> {
            System.out.println(s);
        };
        stringConsumer.accept("value");
    }

    private static Long calcular(Long t, Long u, BiFunction<Long, Long, Long> function) {
        return function.apply(t , u);
    }
}

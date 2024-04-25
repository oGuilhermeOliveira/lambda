package br.com.guilhermeoli.lambdas;

/**
 * @author guiol
 */
public class TesteLambdasThreads {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Exucutando");
            }
        };
        new Thread(r).start();

        Runnable rLambda = () -> System.out.println("Exucutando");
        new Thread(rLambda).start();
    }
}

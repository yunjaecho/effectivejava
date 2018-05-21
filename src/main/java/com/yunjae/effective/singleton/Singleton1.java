package com.yunjae.effective.singleton;

import java.util.function.Supplier;

public class Singleton1 {
    public static void main(String[] args) throws Exception {
        // Elvis elvis = new Elvis();
        Elvis elvis1 = Elvis.instance;
        Elvis elvis2 = Elvis.instance;  // sample instance

        System.out.println(" same instance : " + (elvis1 == elvis2));

        /**
         * A final advantage of using a static factory is that a method reference can be used as a supplier,
         * for example Elvis2::instance is a Supplier<Elvis2>
         */
        Supplier<Elvis2> elvis21 =  Elvis2::getInstance;
        System.out.println(elvis21.get());

    }
}

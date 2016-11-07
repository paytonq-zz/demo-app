package com.example.paytonq.myapplication;

import java.util.Random;

/**
 * Created by paytonq on 11/5/2016.
 */

public class FooFactory {
    public FooObject createFoo() {
        Random random = new Random();
        int semiRandomInt = random.nextInt(500);
        FooObject result = new FooObject();
        result.name = "I am semi-random Foo #" + semiRandomInt;
        return result;
    }
}
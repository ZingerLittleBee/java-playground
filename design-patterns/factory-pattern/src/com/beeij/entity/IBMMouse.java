package com.beeij.entity;

/**
 * 描述
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 14:53
 */
public class IBMMouse implements Mouse{
    @Override
    public void sayHello() {
        System.out.println("I am IBMMouse under lenovo");
    }
}

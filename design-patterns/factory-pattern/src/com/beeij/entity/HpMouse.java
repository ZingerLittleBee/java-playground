package com.beeij.entity;

/**
 * HpMouse
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 11:51
 */
public class HpMouse implements Mouse{
    @Override
    public void sayHello() {
        System.out.println("I am HpMouse");
    }
}

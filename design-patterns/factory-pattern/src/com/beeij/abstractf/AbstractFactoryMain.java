package com.beeij.abstractf;

import com.beeij.entity.Keyboard;
import com.beeij.entity.Mouse;

/**
 * 描述
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 21:14
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        ComputerFactory cf = new HpComputerFactory();
        Mouse mouse = cf.createMouse();
        Keyboard keyboard = cf.createKeyboard();
        mouse.sayHello();
        keyboard.sayHello();
    }
}

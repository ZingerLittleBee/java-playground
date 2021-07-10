package com.beeij.simple;

import com.beeij.entity.Mouse;

/**
 * 描述
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 14:26
 */
public class SimpleMain {
    public static void main(String[] args) {
        Mouse mouse = MouseFactory.createMouse(MouseEnums.DELLMOUSE);
        mouse.sayHello();
    }
}

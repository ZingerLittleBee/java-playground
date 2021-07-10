package com.beeij.abstractf;

import com.beeij.entity.HpKeyboard;
import com.beeij.entity.HpMouse;
import com.beeij.entity.Keyboard;
import com.beeij.entity.Mouse;

/**
 * 描述
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 21:14
 */
public class HpComputerFactory implements ComputerFactory{
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}

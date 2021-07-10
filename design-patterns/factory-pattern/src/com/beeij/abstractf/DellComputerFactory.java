package com.beeij.abstractf;

import com.beeij.entity.DellKeyboard;
import com.beeij.entity.DellMouse;
import com.beeij.entity.Keyboard;
import com.beeij.entity.Mouse;

/**
 * 描述
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 21:13
 */
public class DellComputerFactory implements ComputerFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}

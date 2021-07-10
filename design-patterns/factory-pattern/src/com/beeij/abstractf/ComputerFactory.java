package com.beeij.abstractf;

import com.beeij.entity.Keyboard;
import com.beeij.entity.Mouse;

/**
 * ComputerFactory
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 21:12
 */
public interface ComputerFactory {
    /**
     * createMouse
     * @return Mouse
     */
    Mouse createMouse();

    /**
     * createKeyboard
     * @return Keyboard
     */
    Keyboard createKeyboard();
}

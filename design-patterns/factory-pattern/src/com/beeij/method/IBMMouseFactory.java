package com.beeij.method;

import com.beeij.entity.IBMMouse;
import com.beeij.entity.Mouse;

/**
 * 描述
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 14:52
 */
public class IBMMouseFactory extends LenovoMouseFactory{
    @Override
    public Mouse createMouse() {
        return new IBMMouse();
    }
}

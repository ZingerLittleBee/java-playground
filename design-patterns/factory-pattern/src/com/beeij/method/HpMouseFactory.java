package com.beeij.method;

import com.beeij.entity.HpMouse;
import com.beeij.entity.Mouse;

/**
 * 描述
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 14:24
 */
public class HpMouseFactory implements MouseFactory{
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}

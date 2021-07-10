package com.beeij.simple;

import com.beeij.entity.DellMouse;
import com.beeij.entity.HpMouse;
import com.beeij.entity.LenovoMouse;
import com.beeij.entity.Mouse;

/**
 * 简单工厂模式
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 11:55
 */
public class MouseFactory {
    public static Mouse createMouse(MouseEnums mouseEnums) {
        Mouse mouse;
        switch (mouseEnums) {
            case HPMOUSE:
                mouse = new HpMouse();
                break;
            case DELLMOUSE:
                mouse = new DellMouse();
                break;
            case LENOVOMOUSE:
                mouse = new LenovoMouse();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + mouseEnums);
        }
        return mouse;
    }
}

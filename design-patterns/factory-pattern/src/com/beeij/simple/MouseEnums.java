package com.beeij.simple;

/**
 * 描述
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 11:57
 */
public enum MouseEnums {
    /**
     * DellMouse
     */
    DELLMOUSE("DellMouse", 0),
    /**
     * HpMouse
     */
    HPMOUSE("HpMouse", 1),
    /**
     * LenovoMouse
     */
    LENOVOMOUSE("LenovoMouse", 2);


    String mouseName;

    int mouseType;

    MouseEnums(String mouseName, int mouseType) {
        this.mouseName = mouseName;
        this.mouseType = mouseType;
    }
}

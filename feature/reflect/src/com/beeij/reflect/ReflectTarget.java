package com.beeij.reflect;

/**
 * ReflectTarget
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 21:46
 */
public class ReflectTarget {
    public static void main(String[] args) throws ClassNotFoundException {
        // 第一种方式获取 Class 对象
        ReflectTarget reflectTarget = new ReflectTarget();
        Class reflectTargetClass = reflectTarget.getClass();
        System.out.println("1st: " + reflectTargetClass.getName());

        // 第二种方式获取 Class 对象
        Class reflectTargetClass2 = ReflectTarget.class;
        System.out.println("2nd: " + reflectTargetClass2.getName());

        // 判断两种方式获取的 Class 对象是否是同一个
        System.out.println(reflectTargetClass == reflectTargetClass2);

        // 第三种方式获取 Class 对象
        Class reflectTargetClass3 = Class.forName("com.beeij.reflect.ReflectTarget");
        System.out.println("3rd: " + reflectTargetClass3.getName());
        System.out.println(reflectTargetClass2 == reflectTargetClass3);
    }
}

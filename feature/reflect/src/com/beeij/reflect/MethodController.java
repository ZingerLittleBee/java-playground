package com.beeij.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 描述
 *
 * @author ye
 * @version 1.0.0, 2021-07-19
 * @since 2021-07-19 22:48
 */
public class MethodController {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> clazz = Class.forName("com.beeij.reflect.ReflectTarget");
        // 1. 获取所有公有的方法
        System.out.println("*****************所有公有方法********************");
        Method[] methods = clazz.getMethods();
        System.out.println(Arrays.toString(methods));

        // 2. 获取所有方法
        System.out.println("*****************所有方法(私有、受保护、默认、公有)********************");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));

        // 3. 获取单个公有方法
        System.out.println("*****************单个公有字段********************");
        Method show1 = clazz.getMethod("show1", String.class);
        System.out.println(show1);

        // 4. 获取单个私有的方法
        System.out.println("*****************单个私有字段********************");
        Method show4 = clazz.getDeclaredMethod("show4", int.class);
        System.out.println(show4);

        // 5. 调用 show1, 并执行
        System.out.println("***************调用 show1, 并执行******************");
        ReflectTarget reflectTargetInstance = (ReflectTarget)clazz.newInstance();
        show1.invoke(reflectTargetInstance, "invoke show1");


        // 6. 调用私有的方法, 并执行
        System.out.println("*****************获取一个私有的方法, 并执行********************");
        show4.setAccessible(true);
        show4.invoke(reflectTargetInstance, 123);
    }
}

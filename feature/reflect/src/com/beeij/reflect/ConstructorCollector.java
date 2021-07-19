package com.beeij.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ConstructorCollector
 *
 * @author ye
 * @version 1.0.0, 2021-07-11
 * @since 2021-07-11 00:38
 */
public class ConstructorCollector {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("com.beeij.reflect.ReflectTarget");
        // 1. 获取所有公有的构造方法
        System.out.println("*****************所有公有构造方法********************");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        // 2. 获取所有构造函数
        System.out.println("*****************所有构造方法(私有、受保护、默认、公有)********************");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c: declaredConstructors) {
            System.out.println(c);
        }

        // 3. 获取单个带参数的公有方法
        System.out.println("*****************所有公有构造方法(有两个参数)********************");
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor);

        // 4. 获取单个私有的构造方法
        System.out.println("*****************私有构造方法********************");
        Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class);
        System.out.println(declaredConstructor);

        System.out.println("*****************调用私有构造方法创建实例********************");
        // 暴力访问, 忽略访问修饰符
        declaredConstructor.setAccessible(true);
        ReflectTarget reflectTarget = (ReflectTarget) declaredConstructor.newInstance(1);
    }
}

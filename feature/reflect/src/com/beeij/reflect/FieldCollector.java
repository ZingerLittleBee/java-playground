package com.beeij.reflect;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * 描述
 *
 * @author ye
 * @version 1.0.0, 2021-07-15
 * @since 2021-07-15 22:10
 */
public class FieldCollector {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.beeij.reflect.ReflectTarget");
        // 1. 获取所有公有的字段
        System.out.println("*****************所有公有字段********************");
        Field[] fields = clazz.getFields();
        System.out.println(Arrays.toString(fields));

        // 2. 获取所有字段
        System.out.println("*****************所有字段(私有、受保护、默认、公有)********************");
        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        // 3. 获取单个公有字段
        System.out.println("*****************单个公有字段********************");
        Field name = clazz.getField("name");
        System.out.println(name);

        // 4. 获取单个私有的字段
        System.out.println("*****************单个私有字段********************");
        Field targetInfo = clazz.getDeclaredField("targetInfo");
        System.out.println(targetInfo);
        System.out.println("*****************为字段赋值********************");
        ReflectTarget reflectTargetInstance = (ReflectTarget)clazz.newInstance();

        // 5. 给 field 赋值
        // 暴力访问, 忽略访问修饰符
        targetInfo.setAccessible(true);
        targetInfo.set(reflectTargetInstance, "set new value");
        System.out.println(targetInfo.get(reflectTargetInstance));
    }
}

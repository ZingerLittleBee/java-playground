package com.beeij.reflect;

/**
 * ReflectTarget
 *
 * @author ye
 * @version 1.0.0, 2021-07-10
 * @since 2021-07-10 21:46
 */
public class ReflectTarget {
    /**
     * 默认有参构造函数
     * @param str str
     */
    ReflectTarget(String str) {
        System.out.println("(默认)构造函数方法 s = " + str);
    }

    /**
     * 无参构造函数
     */
    public ReflectTarget() {
        System.out.println("调用了公有的无参构造函数");
    }

    /**
     * 有一个参数的构造函数
     * @param name name
     */
    public ReflectTarget(char name) {
        System.out.println("调用了带有一个参数的构造函数, 参数值为 " + name);
    }

    /**
     * 有多个参数的构造函数
     * @param name name
     * @param index index
     */
    public ReflectTarget(String name, int index) {
        System.out.println("调用了带有多个参数的构造函数, 参数值为 name: " + name + " 序号: " + index);
    }

    /**
     * 收保护的构造函数
     * @param n boolean
     */
    protected ReflectTarget(boolean n) {
        System.out.println("受保护的构造函数");
    }

    private ReflectTarget(int index) {
        System.out.println("私有的构造方法, 序号: " + index);
    }

    /**
     * 字段
     */
    public String name;
    protected int index;
    char type;
    private String targetInfo;

    public void show1(String s) {
        System.out.println("调用了公有的, String 参数的 show1(): s =" + s);
    }

    protected void show2(String s) {
        System.out.println("调用了受保护的, String 参数的 show2(): s =" + s);
    }

    void show3(String s) {
        System.out.println("调用了默认的, String 参数的 show3(): s =" + s);
    }

    private String show4(int index) {
        System.out.println("调用了私有的, 并有返回值的 show4(): index =" + index);
        return "show4";
    }

    @Override
    public String toString() {
        return "ReflectTarget [name=" + name + ", index=" + index + ", type=" + type + ", targetInfo=" + targetInfo + "]";
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 第一种方式获取 Class 对象
        ReflectTarget reflectTarget = new ReflectTarget();
        Class<?> reflectTargetClass = reflectTarget.getClass();
        System.out.println("1st: " + reflectTargetClass.getName());

        // 第二种方式获取 Class 对象
        Class<?> reflectTargetClass2 = ReflectTarget.class;
        System.out.println("2nd: " + reflectTargetClass2.getName());

        // 判断两种方式获取的 Class 对象是否是同一个
        System.out.println(reflectTargetClass == reflectTargetClass2);

        // 第三种方式获取 Class 对象
        Class<?> reflectTargetClass3 = Class.forName("com.beeij.reflect.ReflectTarget");
        System.out.println("3rd: " + reflectTargetClass3.getName());
        System.out.println(reflectTargetClass2 == reflectTargetClass3);
    }
}

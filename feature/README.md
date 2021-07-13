# Java 语言特性

## 反射
概念: 允许程序在**运行时**来进行自我检查并且对内部对成员进行操作
> 反射主要是指程序可以访问, 检查和修改它本身状态或行为的一种能力, 并且根据自身行为的状态和结果, 调整或修改应用所描述行为的状态和相关的语义

### 反射的作用
- 在运行时判断任意一个对象所属的类
- 在运行时获取类的对象
- 在运行时访问 java 对象的属性, 方法, 构造方法等

### Java 的反射库
`java.lang.reflect`类库里面主要的类
- Field: 表示类中的成员变量
- Method: 表示类中的方法
- Constructor: 表示类的构造方法
- Array: 该类提供了动态创建数组和访问数组元素的静态方法

### 反射依赖的 Class
用来表示运行时类型信息的对应类
- 每个类都有唯一一个与之对应的 Class 对象
- Class 类为类类型, 而 Class 对象为类类型对象

#### Class 类的特点
- Class 类也是类的一种, class 则是关键字
- Class 类只有一个私有的构造函数, 只有 JVM 能够创建 Class 类的实例
- JVM 中只有唯一一个和类相对应的 Class 对象来描述其类型信息

#### 获取 Class 对象的三种方式
- Object -> getClass() --> 需要对象实例
- 任何数据类型（包括基础数据类型）都有一个"静态"的 class 属性 --> 需要导入类包
- 通过 Class 类的静态方法: `forName(String className)`(最常用) --> 可以通过配置文件来动态的创建类
> 在运行期间, 一个类, 只有一个与之相对应的 Class 对象产生


## 注解
### 定义 
提供一种为程序元素设置元数据的方法
> 元数据: 添加到程序元素(方法、字段、类和包)上的额外数据



### 特点
- 注解是一种**分散式**的元数据设置方式(与代码绑定在一起)
    > xml 是集中式的设置方式(与代码无绑定)
- 注解不能直接干扰代码的运行
- 注解核心包 `java.lang.annotation`, 所有注解都继承 `Annotation`(可以通过反编译 class 文件验证, javap -verbose 包名.类名)

### 功能
- 作为特定的标记, 用于告诉编辑器一些信息
- 编译时动态处理, 如动态生成代码
- 运行时动态处理, 作为额外信息的载体, 如获取注解信息

### 分类
1. 标准注解: `Override`、`Deprecated`、`SuppressWarnings`
2. 元注解: `@Retention`、`@Target`、`@Inherited`、`@Documented`
3. 自定义注解

#### 元注解
用于修饰注解的注解, 通常用在注解的定义上

- `@Target`: 注解的作用目标
- `@Retention`: 注解的声明周期
- `@Documented`: 注解是否应当被包含在 JavaDoc 文档中
- `@Inherited`: 是否允许子类继承注解

##### `@Target` --- 描述注解的使用范围
- packages、types(类、接口、枚举、Annotation 类型)
- 类型成员(方法、构造方法、成员变量、枚举值)
- 方法参数和本地变量(如循环变量、catch 参数)

##### `@Retention` --- 定义注解生命周期
标注注解被保留事件的长短
Retention 定义
```java
import java.lang.annotation.RetentionPolicy;

public @interface Retention {
    RetentionPolicy value();
}
```
`RetentionPolicy` 枚举值
- `SOURCE` --- 在源文件中保留, 生成 class 时会被去除
- `CLASS` ---  源代码和 class 中都会被保留
- `RUNTIME` --- 在运行时, 可以获取该注解信息

##### `@Documented`(标记注解) --- 将注解信息包含进 JavaDoc
##### `@Inherited` --- 该注解可以被子类继承
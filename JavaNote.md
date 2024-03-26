### Java的特性——java"白皮书“关建术语：
* **简单性：** 剔除C++中一些"危险"的语法如指针、操作符重载等，同时基本支持文件小，适用于嵌入式设备。
* **面向对象：** 类似C++，多重继承改为接口。
* **分布式：** 具有支持便捷访问网络对象的库。
* **健壮性：** 编译器能够在早期检测到更多问题；Java的指针模型更安全。
* **安全性：** 用于网络/分布式环境的安全模型（利用沙箱防范攻击）。
* **体系结构中立：** 由虚拟机动态翻译为机器代码，可以在多种处理器上运行。
* **可移植性:** 定义了明确的数据类型大小和运算，定义了可移植的接口，从而在不同操作系统间移植。
* **解释性:** （？）“Java解释器可以在任何移植了解释器的机器上执行Java字节码。
由于链接是一个增量式且轻量级的过程， 所以，开发过程也变得更加快捷，更加具有探索性。
* **高性能:** 即时编译器可以动态优化代码。
* **多线程:** 支持并发程序设计。
* **动态性:** 程序运行时，库中可以自由添加新方法和实例变量而不影响客户端。
### Java的基本程序设计结构
一个简单的Java程序
```Java
//HelloWorld.java
//源代码的文件名必须与公共类名字相同,且区分大小写。
public class HelloWorld{//驼峰命名法
//Java应用程序中的全部函数都属于某个类的方法，包括main
    public static void main(String[] args){
    //main方法必须是public且static，运行程序时，虚拟机将从指定类重的main方法开始执行
        System.out.println("Hello World!");//使用System.out对象并调用其println方法
    }
}
/*多行
注释*/

/**
 * 一种可以自动生成文档的注释
 */
```
### 基本数据类型
Java是强类型语言。类型的大小与目标平台无关（区别于C）。
1. 整型  

| 类型    | 存储空间(byte) |  
|-------|------------|  
| byte  | 1          |
| short | 2          |
| int   | 4          |
| long  | 4          |
| * 没有unsigned形式 * |

二进制0b/0B，八进制前缀0，十六进制前缀0x/0X，长整型后缀l/L，字面量可加_便于阅读（如1_000_000）

2. 浮点型  

| float | 存储空间（byte） | 有效位数 |
| -----|---------------| -- |
| float | 4 | 6~7 |
| double | 8 | 15 |
float类型后缀f/F，double类型后缀d/D，**没有后缀默认为double类型**

3. char类型  
特殊字符的转义序列  

| 转义序列 | 名称  | Unicode值 |
|----|-----|----------|
| \b | 退格  | \u0008   |
| \t | 制表  | \u0009   |
| \n | 换行  | \u000a   |
| \r | 回车  | \u000d   |
| \" | 双引号 | \u0022   |
| \' | 单引号 | \u0027   |
| \\ | 反斜杠 | \u005c   |

><font color="red">小心\u。</font>  
/u可以出现在加引号的字符常量和字符串之外，而特殊字符的转义序列不行。
> Unicode转义序列会在解析代码之前被处理。
> 例如：  
> // document in C:/users  
> 这个注释会产生语法错误，因为\u后面并未跟着4个十六进制数。  
> 而 "\u0022+\u0022" 解析后得到""+""即空串。

4. boolean类型  
整型值和布尔值之间不能进行相互转换。
5. 类型检查  
   - 常量Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY,Double.NaN(以及相应的Float类型常量)
   > 所有非数值的值都认为是不相同的，不能用 x == Double.NaN 判断x是否为 0/0。但可以用 Double。isNaN(x)

### 变量
声明变量并初始化  
```Java
public class Circle{
   static double radius=3;
   public static final double PI = 3.1415926;
   //final指示常量，常量名一般大写，只能被赋值一次。
   //public表示其他类的方法也可以使用这个常量。
   //static final设置类常量。
   public static double circum(double radius){
      return 2*PI*radius;
   }
   public static void main(String[] args){
      double circum = circum(radius);
      System.out.println(circum);
   }

}
```
Java中不区分变量的声明与定义。
### 运算符  
- 整数被0除产生异常，而浮点数被0除得到无穷大或NaN。




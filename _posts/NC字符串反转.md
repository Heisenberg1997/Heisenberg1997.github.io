# NC103 字符串反转



### String

**1**.本质就是一个**char**数组并且被final修饰过string中的**所有对字符串修改的方法**都是

，由string直接创建的String会放在公共池中，而由**new**创建的内容则放在堆中，公共池会出现多个变量对**同一个**内容的引用，而new的则不是同一个内容。



**2.**常用方法

`str.length()` 返回长度 

`Sting.format` 对数组格式进行控制 格式 %index%【标识】【最小宽度】

-  '-' 在最小宽度内左对齐，不可以与"用0填充"同时使用
-  '#' 只适用于8进制和16进制，8进制时在结果前面增加一个0，16进制时在结果前面增加0x
-  '+' 结果总是包括一个符号(一般情况下只适用于10进制，若对象为BigInteger才可以用于8进制和16进制)
-  ' ' 正值前加空格，负值前加负号(一般情况下只适用于10进制，若对象为BigInteger才可以用于8进制和16进制)
-  '0' 结果将用零来填充
-  ',' 只适用于10进制，每3位数字之间用"，"分隔
-  '(' 若参数是负数，则结果中不添加负号而是用圆括号把数字括起来(同'+'具有同样的限制)

转换方式：

**d-**十进制 **o-**八进制 **x**或**X-**十六进制	

如

```java
System.out.println(String.format("%1$,09d", -3123));
System.out.println(String.format("%1$9d", -31));
System.out.println(String.format("%1$-9d", -31));
System.out.println(String.format("%1$(9d", -31));
System.out.println(String.format("%1$#9x", 5689));
//结果为：
//-0003,123
// -31
//-31
// (31)
// 0x1639　
```

`charAt`

`compareTo`

`contentEquals` 用来做string和stringbuffer内容比较

`matches` 用来匹配正则表达式

`split` 用来按正则表达式分割字符串

`toCharArray` 转换成为char数组

**3.常见问题**

（1）String对象是不可变的： `String a = "xxx";` 实例a表示为公共池中的一个引用，可以改变引用，但是无法改变xxx的值

（2）区分length() length属性 和size() ：length()针对的是**字符串** 对字符串调用length()方法可以计算字符串的长度，而length针对的是**数组**，也是计算数组元素个数，size()针对的是**泛型集合** 看其中内容的多少，比如典型的泛型集合list

（3）字符串加法 ：对于字符串加法相当于先将String转成stringbuffer 在对其进行append

（4）“ String s1=new String(“abc”)”语句创建了几个对象？ 创建了两个 首先在常量池中创建了一个abc 后来在堆中又创建了一个 最终使用的是堆中。参考文章 https://blog.csdn.net/Sqirt/article/details/72765071



StringBuffer



StringBuilder


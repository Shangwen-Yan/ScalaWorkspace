
/**
 * 常量变量
 * 数据类型
 */
object Demo2 {
  def main(args: Array[String]): Unit = {
    //-- 常量和变量的定义 - val定义常量 var定义变量 scala优先使用常量
    var num = 10;
    num = 100;
    val numx = 20;
    //numx = 200;
    
    //--引用的类型的声明 - 类型的声明通常可以省略 会在第一次被赋值时自动推断出引用的类型 并不是没有类型 类型错误仍然会报错
    val name:String = "zhangsan";
    //name = 999;
    val namex = "lisi";
    //namex = 999;
    
    //--九种基本数据类型
    val numz = 123;
    val numz2 = numz.doubleValue();
    println(numz2)
    
    //--String的三引号用法
    val str1 = "ab\\cd\tef\r\ng";
    val str2 = """ab\cd  ef
      g""";
    
    println(str1)
    println(str2)
    
  }
}

/**
 * 操作符
 */
object Demo3 {
  def main(args: Array[String]): Unit = {
    //操作符即方法
    val num1 = 2 + 3;
    println(num1);
    val num2 = 2.+(3);
    println(num2);
    
    //方法即操作符
    val str = "abcdef";
    val c1 = str.charAt(3);
    val c2 = str charAt 3;
    println(c1)
    println(c2)
    
    var str2 = str.toUpperCase();
    var str3 = str toUpperCase;
    println(str2)
    println(str3)
    
    var str4 = str.substring(2, 4);
    var str5 = str substring (2,4);
    println(str4)
    println(str5)
    
    //--操作符的优先级
    val numx = 3 + 2 * 5;
    println(numx)
    
    //--操作符的种类
    //中缀操作符
    val numz1 = 3 + 4;
    val numz2 = 3.+(4);
    
    //后缀操作符
    val strz = "abc";
    strz.toUpperCase();
    strz toUpperCase;
    
    //前缀操作符 一共就4个 +-!~ 前缀操作符在转换为方法时 比较特殊 需要转换为unary_操作符的形式 
    //我们也可以自己定义前缀操作符 但是要注意 只能是+-!~ 其他操作符即使定义为unary_也无法作为前缀操作符使用
    val numt1 = +9;
    val numt1x = 9.unary_+;    
    val numt2 = -9;
    val numt2x = 9.unary_-;
    val flag = !true;
    val flagx = true.unary_!;
    val num3 = ~9;
    val num3x = 9.unary_~;
    
    
  }
}
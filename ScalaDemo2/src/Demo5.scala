
/**
 * 尾递归 - 在实现递归式 使函数的最后一个表达式为调用自己的代码 这样的递归称之为尾递归 scala会优化尾递归 可以大大提高递归的性能
 */
object Demo5 {
  def main(args: Array[String]): Unit = {
    val begin = System.currentTimeMillis();
    //从1开始 偶数相加 如果和值大于50就停止
    def addx(num:Int,sum:Int):Int = {
      if(sum>5000000) return sum;
      if(num % 2 == 0){ println("呵呵，我又调用了。。。");addx(num+1,sum+num)}
      else {println("嘻嘻，我又调用了") ;addx(num+1,sum)}
    }
    
    val result = addx(1,0);
    println(result)
    val end = System.currentTimeMillis();
    println(end - begin)
  }
}

/**
 * 函数01 - 函数的定义
 */
object Demo5 {
  def main(args: Array[String]): Unit = {
    val num = mx5(3,4)
    println(num)
  } 
  /**
   * 函数的定义：[public/private/protected] def 函数名(参数列表):返回值声明 = {函数体}
   */
  def mx1(a:Int,b:Int):Int = {
    a + b
  }
  /**
   * 大部分时候 scala 可以自动推断出 函数返回值的类型 所以可以省略返回值类型的声明 但是要注意 如果去掉返回值类型声明可能会造成歧义 则不能省略
   */
  def mx2(a:Int,b:Int) = {
		  a + b
  }
  /**
   * 如果函数体只有一行内容 则包裹函数体的大括号可以省略
   */
   def mx3(a:Int,b:Int) = a + b
  /**
   * 如果返回值类型是Unit,则另一种写法是可以去掉返回值类型和等号 把方法体写在花括号内,而这时方法内无论返回什么 返回值都是 UNIT
   */
   def mx4(a:Int,b:Int):Unit={
     val num = a + b
     println(num)
   }
   def mx5(a:Int,b:Int){
     val num = a + b
     println(num)
   }
   
}
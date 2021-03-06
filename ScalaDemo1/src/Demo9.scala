
/**
 * 函数02 - 函数的使用04 - 函数值
 * scala中的函数是一等公民 将函数赋值给一个 变量/常量 的用法 就是 函数值 
 */
object Demo9 {
  def main(args: Array[String]): Unit = {
    //将一个普通函数 作为 函数值 赋值给变量/常量
    def eat(food:String){
      println("吃。。。。。"+food)
    }
    val m1 = eat(_);
   m1("777");
    
    //将一个函数直接量 作为 函数值 赋值给变量/常量
    val m2 = (food:String) => {println("可劲吃。。。。"+food)}
    m2("北京烤鸭");
  }
}

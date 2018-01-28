
/**
 * 函数02 - 函数的使用01 - 成员方法 - 函数作为 类/单例对象 的成员来使用
 */
object Demo6 {
  def main(args: Array[String]): Unit = {
    val p = new Person();
    p.eat();
//  p.study();
  }
}

class Person{
  def eat(){
    println("吃。。。。")
  }
  private def study(){
	  println("学。。。。")
  }
}
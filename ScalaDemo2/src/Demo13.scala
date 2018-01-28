/**
 * 抽象类 继承 多态
 */

//抽象类 当了 爹
abstract class Demo13 {
  def mx();
  def mz(){
    println("hahaha")
  }
}

//儿子类
class Demo13x(name:String,age:Int) extends Demo13 {
  def mx(): Unit = {
    println("xixixi")
  }
}

//孙子类1 - 因为他的父类 需要构造参数 所以这个地方需要继承时指定
class Demo13y extends Demo13x("zhang",30){
  
}

//孙子类2 - 因为他的父类 需要构造参数 而他又不想写死 所以将自己的构造参数 传递给了父类 来实现了构造
class Demo13z(name:String,age:Int) extends Demo13x(name,age){
  override def mz(){
    println("lalala")
  }
}

//多态的使用 - 子类当作父类用 - 调用父类方法 执行 的是子类中的方法
object Demo13{
  def main(args: Array[String]): Unit = {
    val obj:Demo13 = new Demo13z("li",19);
    obj.mz();
  }
}
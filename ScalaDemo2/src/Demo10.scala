
/**
 * scala同样支持 重写 和 重载
 */
class Demo10 {
  def say(){
    println("在啦啦啦啦啦的说。。。")
  }
}

class Demo10x extends Demo10{
  //重写 - 必须通过override明确的声明重写
  override def say(){
    println("在呵呵呵呵呵的说。。。。");
  }
  
  //重载
  def eat(){
    println("在么么么的吃。。。。")
  }
  
  def eat(food:String){
    println("在么么么么的吃。。。"+food)
  }
}

/**
 * 类 - 构造器
 */
class Demo9(name:String,age:Int) {
  
  def this(name:String){
    this(name,18);
  }
  
  def this(){
    this("piaoqian")
  }
  
  val addr = "bj";
  def say(){
    println("哈哈哈 我说话了。。"+name+"~"+age)
  }
  
  println("Demo9被实例化了。。。。"+name+"~"+age)
  
}

object Demo{
  def main(args: Array[String]): Unit = {
    val obj = new Demo9("zhang",19);
    obj.say()
    val obj2 = new Demo9("zhang");
    val obj3 = new Demo9();
  }
}
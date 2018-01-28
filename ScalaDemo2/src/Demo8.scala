
/**
 * 单例对象
 */
object Demo8 {
  def sum(a:Int,b:Int):Int={
    a+b
  }
  
  def main(args: Array[String]): Unit = {
    val result = Demo8.sum(2,3)
    println(result)
    
    val p = new Person();
    Person.mx();    
  }
}

package cn.tarena.pojo
class Person {
  val name:String = "zhang";
  //private[cn]  val age:Int = 18;
  protected val gender:String ="male";
  def eat(){
    println(name+"chi...")
  }
  def mx(){
    
  }
  

}

object Person{
  private [cn]val age:Int=19;
}


class Person {
  val name:String = "zhang";
  private val age:Int = 19;
  protected val gender:String = "male";
  def eat(){
    print(name+"在么么的吃。。。")
  }
}

object Person {
  def mx(){
    val p = new Person();
    print("hehehe" + p.age)  
 } 
}
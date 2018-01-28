
/**
 * 函数02 - 函数的使用02 - 本地函数 - 函数内定义的函数称之为本地函数 本地函数只能在其所在的外部函数内被调用
 */
object Demo7 {
  def main(args: Array[String]): Unit = {
    val p = new Personx();
    p.eat("肉");
  }
}

class Personx{
  def eat(food:String){
    def cook(food:String):String={
      return "做熟了的"+food
    }
    val shuFood = cook(food);
    println("吃。。。。"+shuFood)
  }
  
  private def study(){
	  println("学。。。。")
  }
}
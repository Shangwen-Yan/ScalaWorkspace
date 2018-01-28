
/**
 * 高阶函数 - 作为参数传递
 */
object Demo1 {
  def main(args: Array[String]): Unit = {
//    eat("鸡蛋灌饼",(food:String)=>{println("将鸡蛋灌饼放到炉子里烤。。。");"熟了的"+food;});
    eat("豆腐脑",(food:String)=>{println("将豆腐脑放到冰箱里冻上。。。");"凉透了的"+food})
  }
  
  def eat(food:String,mx:(String)=>String){
    println("吃之前洗手。。。。")
    val foodx = mx(food);
    println("么么么么的吃。。。"+foodx)
    println("吃之后睡觉。。。。")
  }
}

/**
 * 高阶函数 - 作为函数的返回值
 */
object Demo2 {
  def main(args: Array[String]): Unit = {
    println("开始做饭。。。。")
    //val mx = chacaipu("鱼香肉丝");
    val mx = chacaipu("宫保鸡丁");
    val food = mx("肉")
    println("做饭完成。。。。"+food)
  }
  
  def chacaipu(name:String):(String)=>String = {
    if("宫保鸡丁" == name){
      (food:String)=>{println("鸡肉胡萝卜花生米切丁。。下锅炒。。。");"做好的宫保鸡丁"}
    }else if("鱼香肉丝" == name){
      (food:String)=>{println("将肉切丝和胡萝卜炒一下。。。");"做好的鱼香肉丝"}
    }else{
    	(food:String)=>{println("随便炒一下。。。");"做好的炒随便"}
    }
  }
  
}
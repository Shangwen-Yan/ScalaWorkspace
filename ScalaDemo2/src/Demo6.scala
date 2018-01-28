
/**
 * 自定义控制结构
 */
object Demo6 {
  
  def main(args: Array[String]): Unit = {
    //柯里化
    addAndPrint1(2, 3, println(_));
    addAndPrint2(2, 3)(println(_));
    addAndPrint3(2)(3)(println(_));
    
    //自定义控制结构
    addAndPrintx(2,3)((num:Int)=>{println(num)})
    addAndPrintx(2,3){
      (num:Int)=>{println(num)}
    }
    //--以下的写法 相当于 综合运用了 高阶函数 + 柯里化 + 最后一个参数括号转大括号 的用法 实现了 自定义控制结构的功能
    //--用起来 和 一个 if for while 的感觉差不多
    addAndPrintx(2,3){
    	println(_)
    }
    
  }
  
  
  def addAndPrintx(a:Int,b:Int)(mx:(Int)=>Unit){
	  val sum = a + b;
	  mx(sum)
  }
  
  def addAndPrint3(a:Int)(b:Int)(mx:(Int)=>Unit){
    val sum = a + b;
    mx(sum)
  }
  def addAndPrint2(a:Int,b:Int)(mx:(Int)=>Unit){
	  val sum = a + b;
	  mx(sum)
  }
  def addAndPrint1(a:Int,b:Int,mx:(Int)=>Unit){
	  val sum = a + b;
	  mx(sum)
  }
}
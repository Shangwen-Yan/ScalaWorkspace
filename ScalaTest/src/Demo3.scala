

object Demo3 {
  def main(args: Array[String]): Unit = {
    val f = (x:Int,y:Int)=>{x+y};
    val f1=(_:Int)+(_:Int);
 
    
    
    val z = handler(2,3,_+_);
    println(z);
  }
  
  
  def handler(a:Int,b:Int,mx:(Int,Int)=>Int):Int = {
    val result= mx(a,b);
    println("经过了处理")
    result;
    
  }
}
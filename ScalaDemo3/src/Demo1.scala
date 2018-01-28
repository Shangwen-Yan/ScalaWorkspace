
/**
 * 其他
 */
object Demo1 {
  def main(args: Array[String]): Unit = {
      //1.泛型
//      val list = List[Int](1,3,5);
      
      //2.lazy
//      lazy val name = "zhang";
      
      //3.option
//      def div(a:Int,b:Int):Int={
//        a/b
//      }
//      println(div(4,2))
//      println(div(4,0))

//      def div(a:Int,b:Int):Option[Int]={
//        if(b != 0){
//          Some(a/b)
//        }else{
//          None
//        }
//      }
//      println(div(4,2).getOrElse(0))
//      println(div(4,0).getOrElse(0))
    
      //4.caseclass - 样例类
      //--默认实现序列化接口
			//--默认自动覆盖 toString equals hashCode方法
			//--不需要new可以直接生成对象
      val obj1 = new Demo1();
      val obj2 = Demo1();
    
  }
}

case class Demo1(){
  
}
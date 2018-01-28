

/** 
 * scala多线程 
 */
object Demo10 {
  def main(args: Array[String]): Unit = {
   //非阻塞方式
//    import scala.concurrent.Future
//    import scala.concurrent.ExecutionContext.Implicits.global
//    var fu = Future{
//      println("线程开始了。。。")
//      Thread.sleep(3 * 1000);
//      100
//    }
//    
//    fu.onSuccess{			
//		 	case x => println("fu成功了，返回了"+x)
//	  }
//   
//    Thread.sleep(5 * 1000);
    
    //阻塞方式
//    import scala.concurrent.Future
//		import scala.concurrent.ExecutionContext.Implicits.global
//		import scala.concurrent.Await
//		import scala.concurrent.duration.Duration
//		var fu = Future{
//		  println("线程开始执行了。。。") 
//		  Thread.sleep(3 * 1000);
//		  100
//    };
//    var result = Await.result(fu, Duration.Inf);
//    println(result)
  }
}
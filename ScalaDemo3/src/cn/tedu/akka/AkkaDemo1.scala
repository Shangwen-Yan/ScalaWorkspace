package cn.tedu.akka
import scala.actors._, Actor._ 

/**
 * Actor向单一线程发送数据
 */
object AkkaDemo1 {
  def main(args: Array[String]): Unit = {
    val myActor = actor{
      receive{
        case x:String => println("收到String消息："+x)
        case x:Int => println("收到Int消息："+x)
        case x:Person => println("收到Person消息："+x.namex +"~" +x.agex)
      }
    }
    myActor ! new Person("zhangsan",19)
  }
}
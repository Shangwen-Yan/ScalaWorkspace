package cn.tedu.akka

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

/**
 * Akka跨线程之间的通信
 */
object AkkaDemo2 {
  class Actor1 extends Actor {
    def receive: Actor.Receive = {
      case x:Person => {
          println("A1收到Person消息："+x.namex +"~" +x.agex)
          val a2 =  context.actorOf(Props[Actor2])
          a2 ! x
      }
    }
  }
  
  class Actor2 extends Actor{
    def receive: Actor.Receive = {
      case x:Person => println("A2收到Person消息："+x.namex +"~" +x.agex)
    }
  }
  
  def main(args: Array[String]): Unit = {
    val sys = ActorSystem("sys");
    val a1 = sys.actorOf(Props[Actor1])
    a1 ! new Person("lisi",19);
  }
}

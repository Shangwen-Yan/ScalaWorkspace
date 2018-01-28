package cn.tedu.akka

import akka.actor.Actor
import java.util.HashMap
import java.util.ArrayList
import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory
import akka.actor.Props

/**
 * Akka的跨进程通信
 */
object AkkaDemo3 {
  class A3 extends Actor {
    def receive: Actor.Receive = {
      case x:Person => println("A3收到消息："+x.namex+"~"+x.agex)
    }
  }
  
  def main(args: Array[String]): Unit = {
    val conf = new HashMap[String,Object]()
		
    val list = new ArrayList[String]()
		list.add("akka.remote.netty.tcp")
		conf.put("akka.remote.enabled-transports", list)  //参数是个集合
		conf.put("akka.actor.provider", "akka.remote.RemoteActorRefProvider")
		conf.put("akka.remote.netty.tcp.hostname", "127.0.0.1")
		conf.put("akka.remote.netty.tcp.port", "44444")

		val sys = ActorSystem("myAkkaServer",ConfigFactory.parseMap(conf));
		sys.actorOf(Props[A3],"actor3")
  }
}
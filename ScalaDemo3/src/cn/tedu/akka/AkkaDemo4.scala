package cn.tedu.akka

import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory

/**
 * Akka的跨进程通信
 */
object AkkaDemo4 {
  
  def main(args: Array[String]): Unit = {
      //参数配置
			val conf = new java.util.HashMap[String,Object]()
			val list = new java.util.ArrayList[String]()
			list.add("akka.remote.netty.tcp")
			conf.put("akka.remote.enabled-transports", list)  //参数是个集合
			conf.put("akka.actor.provider", "akka.remote.RemoteActorRefProvider")
			conf.put("akka.remote.netty.tcp.hostname", "127.0.0.1")
			conf.put("akka.remote.netty.tcp.port", "44443")

			val sys = ActorSystem("myAkkaClient", ConfigFactory.parseMap(conf))
			sys.actorSelection("akka.tcp://myAkkaServer@127.0.0.1:44444/user/actor3") ! new Person("wangwu",30)
  }
}
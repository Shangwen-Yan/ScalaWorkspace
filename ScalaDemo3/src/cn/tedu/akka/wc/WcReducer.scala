package cn.tedu.akka.wc

import akka.actor.Actor
import java.util.HashMap
import java.util.ArrayList
import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory
import akka.actor.Props

object WcReducer {
  
  class ReduceActor extends Actor {
    def receive: Actor.Receive = {
      case info2:WcInfo2 => {
        //1.执行reduce处理 得到单词计数的结果
        val data = info2.datax;
        val reduceFunc = info2.reduceFuncx;
        val result = reduceFunc(data);
        //2.打印结果
        println(result)
      }
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

		val sys = ActorSystem("myAkkaReducerServer",ConfigFactory.parseMap(conf));
		sys.actorOf(Props[ReduceActor],"reducerActor")
  }
}
package cn.tedu.akka.wc

import akka.actor.Actor
import java.util.HashMap
import java.util.ArrayList
import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory
import akka.actor.Props

object WcMapper {
  class MapActor extends Actor {
    def receive: Actor.Receive = {
      case info:WcInfo1 => {
        //执行map处理
        val data = info.datax;
        val mapFunc = info.mapFuncx;
        val reduceFunc = info.reduceFuncx;
        val result = mapFunc(data);
        val info2 = new WcInfo2(result,reduceFunc);
        //调用reduce
        context.actorSelection("akka.tcp://myAkkaReducerServer@127.0.0.1:44444/user/reducerActor") ! info2
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
		conf.put("akka.remote.netty.tcp.port", "44443")

		val sys = ActorSystem("myAkkaMapperServer",ConfigFactory.parseMap(conf));
		sys.actorOf(Props[MapActor],"mapActor")
  
  }
}
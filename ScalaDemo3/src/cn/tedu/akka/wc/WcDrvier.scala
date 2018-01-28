package cn.tedu.akka.wc

import java.io.BufferedReader
import java.util.Scanner
import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory

object WcDrvier {
  def main(args: Array[String]): Unit = {
    //参数配置
		val conf = new java.util.HashMap[String,Object]()
		val list = new java.util.ArrayList[String]()
		list.add("akka.remote.netty.tcp")
		conf.put("akka.remote.enabled-transports", list)  //参数是个集合
		conf.put("akka.actor.provider", "akka.remote.RemoteActorRefProvider")
		conf.put("akka.remote.netty.tcp.hostname", "127.0.0.1")
		conf.put("akka.remote.netty.tcp.port", "44442")
		val sys = ActorSystem("myAkkaDriverServer", ConfigFactory.parseMap(conf))
   
		while(true){
    	//1.循环读取控制台
    	val scan = new Scanner(System.in);
    	val line = scan.nextLine();
    	println(line)
      //2.将接收到的数据 和 算法 发送个mapper
    	val data = line;
    	val mapFunc = (_:String).split(" ").map((_,1))
    	val reduceFunc = (_:Array[(String,Int)]).groupBy(_._1).mapValues(_.map(_._2)).mapValues(_.reduce(_+_))
    	val info = new WcInfo1(data,mapFunc,reduceFunc);
      
			sys.actorSelection("akka.tcp://myAkkaMapperServer@127.0.0.1:44443/user/mapActor") ! info
    
    }
  }
}
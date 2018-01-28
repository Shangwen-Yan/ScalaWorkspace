package cn.tedu.akka.wc

class WcInfo2 (data:Array[(String,Int)],reduceFunc:Array[(String,Int)]=>Map[String,Int]) extends Serializable{
  val datax = data
  val reduceFuncx = reduceFunc
}
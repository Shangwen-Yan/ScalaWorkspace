package cn.tedu.akka.wc

class WcInfo1 (data:String,mapFunc:(String)=>Array[(String,Int)],reduceFunc:Array[(String,Int)]=>Map[String,Int]) extends Serializable{
  val datax = data
  val mapFuncx = mapFunc
  val reduceFuncx = reduceFunc
}
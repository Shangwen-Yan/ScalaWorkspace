
/**
 * Map
 */
object Demo6 {
  def main(args: Array[String]): Unit = {
    //1.定义map
    val m1 = Map(1->"bj",2->"sh",3->"gz");
    //2.追加数据
    val m2 = m1 + (4->"sz");
    println(m2)
    //3.减少数据
    val m3 = m1 - 3
    println(m3)
    //4.获取map长度
    val size = m1.size
    println(size)
    //5.遍历map
    m1.foreach(println(_))
    for(key <- m1.keySet){
      val value = m1.getOrElse(key, null);
      println(key+"~"+value)
    }
    //6.用zip来生成map
    val list1 = List("小明","小花","小白","小刚");
    val list2 = List("北京","上海","广州","铁岭");
    val m4 = list1.zip(list2).toMap;
    println(m4)
  }
}

/**
 * Tuple
 */
object Demo7 {
  def main(args: Array[String]): Unit = {
    //创建元组
    val t1 = (1,"美芽",30,"femle","日本");
    println(t1)
    val t2 = Tuple3(1,"aaa","xxx")
    //获取元组中的元素
    println(t1._2);
    println(t2)
  }
}
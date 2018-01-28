
/**
 * 常用操作
 */
object Demo8 {
  def main(args: Array[String]): Unit = {
    //1.判断是否存在
    val l1 = List(1,3,5,7,87,342,3,7,5,4567,234,23);
    println(l1.exists(_%2==0))
    
    //2.排序
    val l2 = List(1,3,5,7,87,342,3,7,5,4567,234,23);
    println(l2.sorted);
    println(l2.sortWith(_>_));
    
    //3.去重
    val l3 = List(1,3,5,7,87,342,3,7,5,4567,234,23);
    println(l3.distinct);
    
    //4.反转
    val l4 = List(1,3,5,7,87,342,3,7,5,4567,234,23);
    println(l4.reverse)
    println(l4.reverseMap(_*10))
    
    //5.判断 是否包含 是否以指定元素开头 是否以指定元素结尾
    val l5 = List(1,3,5,7,87,342,3,7,5,4567,234,23);
    println(l5.contains(100))
    println(l5.startsWith(List(1,3,5)))
    println(l5.endsWith(List(234,23)))
    
    //6.求交集 差集 并集
    val l6 = List(1,2,3,4,5,6,7);
    val l7 = 5 to 10;
    println(l6 intersect l7)
    println(l6 diff l7);
    println(l6 union l7);
  }
}
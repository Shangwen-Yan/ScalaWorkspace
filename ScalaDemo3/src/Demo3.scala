
/**
 * 列表
 */
object Demo3 {
   def main(args: Array[String]): Unit = {
     //1.创建列表
     val list1 = List[String]("aaa","bbb","ccc");
     val list2 = "ddd" :: "eee" :: "fff" :: Nil;
     //2.获取数据
     val list3 = 1 :: 3 :: 5 :: 7 :: 9 :: Nil;
     println(list3(2))
     println(list3.head)
     println(list3.tail)
     println(list3.length)
     println(list3.sum)
     
     //3.其他
     val list4 = list2 ::: list3;
     println(list4)
     val list5 = -100 +: list3 :+ 100;
     println(list5)
     val list6 = list3.drop(2);
     println(list6)
     val list7 = list3.dropRight(2);
     println(list7)
     val list8 = list3.updated(2, 999);
     println(list8)
     println(list3)
   }
}
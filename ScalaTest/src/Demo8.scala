

object Demo8 {
  def main(args: Array[String]): Unit = {
    
      val list1=1::2::3::4::Nil;
      println(list1);
     
      
      val list2=Nil.::(1).::(2).::(3).::(4);
       println(list2);
      val list4=list1:::list2;
       println(list4);
      val list5=(-11)+:list1:+11;
      println(list5)
  }
}
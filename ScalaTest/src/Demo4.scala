package cn.taaa
import cn.tarena.pojo._
//import cn.tarena.pojo.{Person=>P}


object Demo4 {
 def main(args: Array[String]): Unit = {
  val p = new Person();
   // println(p.age);
    println(Person.age);
   val test="aa"+"bb";
    val list = List(1,2,3,4,5);
    for(num <-list){
      println("hahah"+num)
    }
    list.foreach { num:Int => println("呵呵"+num)};
    list.foreach { println(_)};
    
    
 }
  
  
  
}
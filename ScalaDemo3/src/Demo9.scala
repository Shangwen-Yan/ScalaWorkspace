
import java.util.Scanner
import java.io.File
import scala.io.Source
 


 /** 
  *  高阶函数
  */
object Demo9 {
   def main(args: Array[String]): Unit = {
     //1.partition 拆分
//     val l1 = List(1,23,4,65,345,657,789,234,4,53,123);
//     println(l1.partition { _<100 });
     
     //2.map 映射
//     val l2 = List(1,23,4,65,345,657,789,234,4,53,123);
//     println(l2.map { _/10 })
     
     //3.filter filterNot 过滤/反向过滤
//     val l3 = List(1,23,4,65,345,657,789,234,4,53,123);
//     println(l3.filter { _ < 100 })
//     println(l3.filterNot { _ < 100 })
     
     //4.reduce 化简
//     val l4 = List(1,2,4,5,6,7,8,9,10);
//     println(l4.reduce(_+_));
     
     //5.par 并发计算
//     val begin = System.currentTimeMillis(); 
//     val l5 = 1 to 1000000;
//     val result = l5.par.reduce((a:Int,b:Int)=>{println(Thread.currentThread().getId);a+b});
//     println(result)
//     val end = System.currentTimeMillis();
//     println(end - begin)
     
     //6.groupBy 分组
//     val l6 = List(1,3,234,456,678,345,459,435,2,3,6);
//     println(l6.groupBy(_%2))
     val l7 = List(("北京",1),("上海",3),("天津",2), ("北京",2), ("北京",1), ("上海",4), ("北京",2))
     println(l7.groupBy(_._1))
     
     //7.mapValues 将map的值做映射
//     val m1 = Map(1->"北京",2->"上海",3->"广州",4->"深圳");
//     println(m1.mapValues("BIG"+_));
     
     //8.案例：wordCount
    /* val result = Source.fromFile("e:\\words.txt").getLines().toList
        .map((_,1))
        .groupBy(_._1)
        .mapValues(_.map(_._2))
        .mapValues(_.reduce(_+_));
     println(result)*/
   }
}
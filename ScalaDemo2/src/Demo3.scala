
/**
 * 占位符的使用
 */
object Demo3 {
   def main(args: Array[String]): Unit = {
     //用来替代函数直接量中 方法参数名的声明
     val m1 = (x:Int,y:Int)=>{x*y}
     val m2 = (_:Int)*(_:Int)
     val z = handler(2, 3, _*_)
     println(z)
     
     val list:List[Int] = List(1,3,5,7,9);
     for(num <- list){
       println("哈哈哈"+num)
     }
     
     list.foreach((num:Int)=>{println("呵呵"+num)})
     
     list.foreach(println(_))
     
     //在定义函数值时用来替代整个或部分参数列表
     val mx1 = sum(2,3,4);
     val mx2 = sum(_:Int,3,_:Int);
     println(mx2(10,20));
     val mx3 = sum _
     println(mx3(1,3,5))
   }
   
   def sum(a:Int,b:Int,c:Int):Int = {
     return a+b+c;
   }
   
   def handler(a:Int,b:Int,mx:(Int,Int)=>Int):Int = {
     val result = mx(a,b)
     println("经过了处理。。。")
     result;
   }
}
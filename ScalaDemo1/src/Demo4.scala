

import java.io.IOException

/**
 * 控制结构
 */
object Demo4 {
  def main(args: Array[String]): Unit = {
    //1.if判断 - 可以具有返回值 方便于实现函数式编程风格的代码
//    val x = 110;
//    val result = if(x<100){
//      "小了。。。"
//    }else{
//    	"大了。。。"
//    }
//    println(result)
    
    
    //2.while do...while 
    //--不能带回返回值 所以经常要在循环内产生额外影响 
    //--在循环遍历时很可能需要使用变量来控制循环的执行 
    //--所以 while do...while不太符合函数式编程的风格 所以官方推荐尽量少用
    //--官方建议可以使用递归来替代循环的使用
//    val list = List(1,3,5,7,9);
//    var index = 0;
//    val result = while(index<list.size){
//      println(list(index));
//      index += 1
//    }
//    println(result)
    
//    val list = List(1,3,5,7,9);
//    mx(list,0);
//    def mx(list:List[Int],index:Int){
//    	println(list(index));
//      if(index+1<list.size)mx(list,index+1);
//    }
    
    
    //3.for循环 - 同样可以实现 普通for循环 和 增强for循环 并且提供了比javafor更强大的能力
    //--增强for的使用
//    val list = List(1,3,5,7,9);
//    for(num <- list){
//      println(num)
//    }
    //--普通for的使用 - 本质上是借助range实现的增强for循环
//    for(x <- 1 to 100){
//      println(x)
//    }
    //--for过滤循环
    //----案例：遍历0到100的偶数
//    for(x <- 1 to 100){
//      if(x %2 ==0) println(x);
//    }
//    for(x <- 1 to 100 if x % 2 == 0){
//      println(x)
//    }
    //----案例：遍历0到100的偶数 过滤出其中大于30小于80的数
//    for(x <- 1 to 100; if x%2==0; if x>30 ;if x<80){
//      println(x)
//    }
    //--嵌套循环
    //----案例：利用for实现九九乘法表
//    for(a <- 1 to 9){
//      for(b <- 1 to a){
//        print(b+"*"+a+"="+a*b+"\t");
//      }
//      println()
//    }
//    for(a <- 1 to 9;b <- 1 to a){
//       print(b+"*"+a+"="+a*b+flag);
//    }
    //--流间变量定义
//    for(a <- 1 to 9;b <- 1 to a){
//       val flag = "\r\n"
//       print(b+"*"+a+"="+a*b+flag);
//    }
//    for(a <- 1 to 9;b <- 1 to a;val flag = "\r\n"){
//       print(b+"*"+a+"="+a*b+flag);
//    }
    //----综合使用 嵌套循环 流间变量定义  过滤功能 可以完成完整的九九乘法表
//    for(a <- 1 to 9;b <- 1 to a;val flag = if(a == b)"\r\n" else "\t"){
//       print(b+"*"+a+"="+a*b+flag);
//    }
    //--for的yield带回返回值 - for本身的返回值是Unit类型 无法返回信息 但是可以通过在循环条件和循环体之间加上yield关键字 将for返回的结果组成集合返回
//    val result = for(a <- 1 to 9;b <- 1 to a;val flag = if(a == b)"\r\n" else "\t") yield b+"*"+a+"="+a*b+flag
//    println(result)
    
    
    //4.try..catch..finally --可以具有返回值-- 和java中的异常机制基本相同 但是finally中不可以带返回值 即使写了返回也会被忽略
//    try{ 
//        //throw new RuntimeException("hehe");
//        //throw new NullPointerException("hehe");
//        throw new RuntimeException("hehe");
//    }catch {
//      case t: IOException => println("IO异常。。。");t.printStackTrace();
//      case t: NullPointerException => println("空指针异常。。。");t.printStackTrace();
//      case t: Exception => println("其他异常。。。");t.printStackTrace();
//    }finally {
//      println("不管咋样 我都要执行。。。")
//    }
//   def mx():String = {
//      try{
//        //"a"
//        throw new RuntimeException()
//      }catch {
//        case t :Exception => "b" 
//      }finally {
//         println("我是finally。。。。")
//         "c"
//      }
//    }
//    val result = mx();
//    println(result)
    
   
    //5.match -- 类似于java中的switch..case.. 
    //-- 和case匹配后直接执行case之后的内容 执行过后跳出match 并不会像java那样 将后续的case都执行 
    //- match可以带有返回值 会直接返回符合的case中最后一个表达式的值
//    val str = "bbb"
//    val result = str match {
//      case "aaa" => "hehe"
//      case "bbb" => "xixi"
//      case "ccc" => "haha"
//      case _=>"lala"
//    }
//    println(result)
    
    //6.continue break - 继续循环 跳出循环 - scala中没有这两个关键字
    //--可以自己通过变量加判断的方式实现
    //----案例：求1到100的奇数相加 总的和值大于50时停止
//  //java代码
//    int sum = 0;
//    for(int x=1;x<100;x++){
//      if(x%2==0){
//        continue;
//      }else{
//        sum += x;
//      }
//      if(sum>50){
//        break;
//      }
//    }
    //scala通过 变量+判断 来实现
//    var sum = 0;
//    var x = 1;
//    var flag = true;
//    while(x<100 && flag){
//      if(x % 2 == 0){
//        
//      }else{
//        sum += x;
//      }
//      if(sum > 50){
//        flag = false;
//      }
//      x += 1;
//    }
    //scala通过 递归 来实现
//    def mx(x:Int,sum:Int):Int = {
//      if(x<100 && sum<50){
//        if(x % 2 ==0){
//          mx(x+1,sum);
//        }else{
//          mx(x+1,sum+x);
//        }
//      }else{
//        sum;
//      }
//    }
//    val result = mx(1,0);
//    println(result)
    
    
    //7.常量/变量作用范围 -- 规则和java一致
//    val a = 2;
//    if(true){
//    	println(a)
//      val a = 3;
//      println(a)
//    }
//    println(a)
  }
}
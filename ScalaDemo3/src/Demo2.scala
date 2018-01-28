
/**
 * 数组
 */
object Demo2 {
     def main(args: Array[String]): Unit = {
       //1.定义义数组
       val arr1 = new Array[String](3);
       val arr2 = Array[String]("aaa","bbb","ccc");
     
       //2.从数组获取数据
       println(arr2(1))
       
       //3.遍历数组
       for(str <- arr2){
         println(str)
       }
       for(index <- 0 to arr2.length-1){
         println(arr2(index))
       }
       
       //4.修改数组内容
       arr2(1) = "ddd"
       println(arr2(1))
       
       //5.多维数组
       //val arr3 = Array.ofDim(3, 2);
       
       //6.其他方法
//       //val arr4 = Array.iterate(1, 10)((x:Int)=>{x*2})
//       //val arr4 = Array.iterate(1, 10)(_*2)
//       val arr4 = Array.iterate(1, 10){
//         _*2
//       }
//       for(num <- arr4){
//         println(num)
//       }
       
//       val arr5 = Array.range(0, 100,2);
//       for(num <- arr5){
//         println(num)
//       }

         val arr6 = Array.tabulate(10)(_*2)
         for(num <- arr6){
           println(num)
         }
     }
}
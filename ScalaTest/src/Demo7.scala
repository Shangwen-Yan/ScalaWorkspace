

object Demo7 {
  def main(args: Array[String]): Unit = {
    
    val arr1 = new Array[String](3);
    arr1(1)="111";
    
//    val arr2 = new Array[String]("111","222","333");
    val arr2 = Array[String]("111","222","333");
    
    for(str<-arr2){
      println(str);
    }
    for(index <- (0 to arr2.length-1)){
      println(arr2(index));
    }
    
    //val arr4 = Array.iterate(1, 10)((x:Int)=>{x*2});
   // val arr4 = Array.iterate(1, 10)(_*2);
    val arr4 = Array.iterate(1, 10){_*2};
    for(str<-arr4){
      println(str);
    }
    
  }
}
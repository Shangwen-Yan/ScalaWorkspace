
/**
 * Range Vector Set Tuple
 */
object Demo5 {
  def main(args: Array[String]): Unit = {
    //Range
    val r1 = 1 to 100;
    println(r1)
    
    for(x <- 1 to 10){
      println(x)
    }
    
    val arr = r1.toArray
    val list = r1.toList
    
    //Vector
    val v1 = Vector(1,3,5);
    
    //Set
    val s1 = Set(1,3,5,7,9,3,9,11,7,13);
    println(s1)
    
  }
}
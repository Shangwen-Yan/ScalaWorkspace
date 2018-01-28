
/**
 * 重复参数(可变参数)
 */
object Demo4 {
  def main(args: Array[String]): Unit = {
    val n = sum(1,3,5);
    println(n)
  }
  
  def sum(nums:Int*):Int = {
    var sum = 0;
    for(num <- nums){
        sum += num
    }
    sum
  }
}
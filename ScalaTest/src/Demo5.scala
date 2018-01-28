

object Demo5 {
  def main(args: Array[String]): Unit = {
    var begin = System.currentTimeMillis();
    def addx(num:Int,sum:Int):Int = {
      if(sum>50)return sum;
      if(num%2 ==0){
        println("hehe")
        addx(num+1,sum+num)
      }else{
        println("xixi")
        addx(num+1,sum)
      }
 
    }
    

      println(addx(1,0));
      
      var end = System.currentTimeMillis();
      println(end-begin);
  }
}
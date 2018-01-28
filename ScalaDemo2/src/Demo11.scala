/**
 * 包的使用
 */

package cn.tedu{
  package park{
    class Demo11 {
      //val age = 19;
      def age() = 19
      
    }
    
    object Demo11{
      def main(args: Array[String]): Unit = {
    		  val obj = new Demo11();
    //		  print(obj.age)
          print(obj.age())  
      }
      
    }
  }
  
  package qian{
    class xxx{}
  }
}
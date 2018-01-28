

object Demo01 {
  def main(args: Array[String]): Unit = {
     lazy val name = "li";
     val list = List[Int](1,3,5);
     
     def div(a:Int,b:Int):Int={
       a/b;
     }
     
    try{
      println(div(1,0)); 
    }catch{
      case t :Throwable=>println("exception");
    }
    
    def div2(a:Int,b:Int):Option[Int]={
        if(b!=0){
          Some(a/b);
        } else{
          None
        }
     }
    
    println(div2(4,0).getOrElse(0));
    val demo1 = Demo1();
    
    
    
  }
}

case class Demo1(){
  
  
}


object Demo2 {
  def main(args: Array[String]): Unit = {
    println("开始做饭");
    val mx =chacaipu("鱼香肉丝");
    val food = mx("鱼香肉丝2")
    println("做饭完成，获得："+food);
    
       
   
    
    
    
    
  }
  
  
  def chacaipu(name:String):((String)=>String )= {
      if("宫保鸡丁"==name){
        (food:String)=>{println("描述如何做宫保鸡丁");"做好的"+food}
      }else if("鱼香肉丝"==name){
        (food:String)=>{println("描述如何做鱼香肉丝");"做好的"+food}
      }else{
        (food:String)=>{println("随便做一下");"做好的"+food}
      }
      
    } 
}
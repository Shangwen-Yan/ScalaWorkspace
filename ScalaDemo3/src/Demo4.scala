
import scala.collection.mutable.ArrayBuffer
 
/** 
 * ArrayBuffer
 * ListBuffer
 */
object Demo4 {
  def main(args: Array[String]): Unit = {
    val buf = ArrayBuffer(1,3,5);
    buf += 7;
    println(buf)
    
    val arr = buf.toArray;
    val list = buf.toList;
  }
}
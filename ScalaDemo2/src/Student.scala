

abstract class People{
  def say();
  def eat(){
    println("吃。。。。")
  }
}

abstract class Student extends People{
  
}

trait DriveSkill{
  def drive(){
    println("老司机上路，开始飙车。。。。")
  }
}

trait CookSkill{
  def cook(){
    println("炒一盘。。。喝一盅。。。")
  }
}

class A extends CookSkill with DriveSkill{
  
}

class JavaStudent extends Student with DriveSkill with CookSkill {
  def say(): Unit = {
  }
}
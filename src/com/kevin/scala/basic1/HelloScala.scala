package com.kevin.scala.basic1

object HelloScala {
  def main(args: Array[String]): Unit = {
    println("Hello Scala World")
    
    //无参数调用可以直接doWhile
    doWhile()
    
    println(looper(100, 298))
  }
  
  def doWhile(){
    var line = ""
    do{
      line = readLine()
      println("read:" + line)
    }while(line != "")
  }
  
  def looper(x:Long, y:Long):Long = {
    var b = 0l;
    b = x%y
    
    b
  }
}
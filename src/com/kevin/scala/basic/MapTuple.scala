package com.kevin.scala.basic

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object MapTuple {

  def main(args: Array[String]): Unit = {
    //将map中的value*0.9
  val map = Map("book"->10,"gun"->18,"ipad"->1000)  
  for((k,v) <- map) yield (k,v * 0.9)
  
  val scores = scala.collection.mutable.Map("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 10 )
  val hadoopScore = scores.getOrElse("Hadoop", 0)//没有返回0
  //添加R->9,删除Hadoop
  scores += ("R" -> 9)
  scores -= "Hadoop"
  
  //按key排序
  val sortedScore = scala.collection.immutable.SortedMap("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 10 )
  
  //索引1开头，用于返回值有若干个的时候
  val tuple =(1,2,3.14,"Rocky","Spark")
  val third = tuple._3
  //反过来赋给指定变量的tuple类型，first=1，secod=2.....
  val (first,second,thirda,fourth,fifth) = tuple
  //-占位符
  val (f, s, _, _, _) = tuple
  
  "Rocky Spark".partition(_.isUpper)
  
  //拉链操作
  val symbols = Array("[", "-", "]")
  val counts = Array(2,5,2)
  val pairs = symbols.zip(counts)
  for ((x,y) <- pairs) print(x*y)
  
  }

}
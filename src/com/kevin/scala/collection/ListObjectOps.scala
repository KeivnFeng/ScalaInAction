package com.kevin.scala.collection

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object ListObjectOps {

  def main(args: Array[String]) {
    println(List.apply(1, 2, 3))
    //println(List.make(3, 5))
    println(List.range(1, 5))//左闭右开
    println(List.range(9, 1, -3))//步长是3, 9, 9-3, 9-3-3
    
    val zipped = "abcde".toList zip List(1, 2, 3, 4, 5)//拉链操作
    println(zipped)
    println(zipped.unzip)
    
    println(List(List('a', 'b'), List('c'), List('d', 'e')).flatten)
    println(List.concat(List(), List('b'), List('c')))
 
    //println(List.map2(List(10, 20), List(10, 10)) (_ * _))
  
  }

}
package com.kevin.scala.function

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object PartialAppliedFuntion {

  def main(args: Array[String]){
    val data = List(1, 2, 3, 4, 5, 6)
//    data.foreach(println _)//偏函数
//    data.foreach(x => println(x))
    
//    def sum(a: Int, b: Int, c: Int) = a + b + c
//    println(sum(1, 2, 3))
//    
//    val fp_a = sum _
//    println(fp_a(1, 2, 3))
//    println(fp_a.apply(1, 2, 3))
//    val fp_b = sum(1, _: Int, 3)
//    println(fp_b(2))
//    println(fp_b(10))
    
    data.foreach(println _)
    data.foreach(println)
  }

}
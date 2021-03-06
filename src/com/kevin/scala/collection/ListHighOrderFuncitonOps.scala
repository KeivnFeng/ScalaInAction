package com.kevin.scala.collection

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object ListHighOrderFuncitonOps {

  def main(args: Array[String]) {
    println(List(1, 2, 3, 4, 6) map (_ + 1))
    val data = List("Scala", "Hadoop", "Spark")
    /*println(data map (_.length))
    println(data map (_.toList.reverse.mkString))

    println(data.map(_.toList))
    println(data.flatMap(_.toList))
    println(List.range(1, 10) flatMap (i => List.range(1, i) map (j => (i, j))))

    var sum = 0
    List(1, 2, 3, 4, 5) foreach (sum += _) //无结果操作
    println("sum : " + sum)

    println(List(1, 2, 3, 4, 6, 7, 8, 9, 10) filter (_ % 2 ==0))
    println(data filter (_.length == 5))*/
    
    
    println(List(1, 2, 3, 4, 5) partition (_ % 2 ==0))
    println(List(1, 2, 3, 4, 5) find (_ % 2 ==0))//找出集合中第一个满足条件的元素
    println(List(1, 2, 3, 4, 5) find (_  <=0))
    println(List(1, 2, 3, 4, 5) takeWhile (_  < 4))
    println(List(1, 2, 3, 4, 5) dropWhile (_  < 4))
    println(List(1, 2, 3, 4, 5) span (_  < 4))
    
    def hastotallyZeroRow(m: List[List[Int]]) = m exists (row => row forall (_ == 0))//判断矩阵每一行的值都是0,返回true
    val m= List(List(1,0,0), List(0,1,0), List(0,0,1))
    println(hastotallyZeroRow(m))
    
  }

}
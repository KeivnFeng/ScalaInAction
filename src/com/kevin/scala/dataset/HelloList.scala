package com.kevin.scala.dataset

/**
  * Author: 	Wang Jialin
  * Contact Information:
  * WeChat:	18610086859
  * QQ:		1740415547
  * Email: 18610086859@126.com
  * Tel:	18610086859
  */
object HelloList {

  def main(args: Array[String]) {

    val bigData = List("Hadoop", "Spark")
    val data = List(1, 2, 3)

    val bigData_Core = "Hadoop" :: ("Spark" :: Nil)//第一个元素书Hadoop,其他元素是从Spark到Nil,另一种申明 ("Hadoop", "Spark"。。。。Nil)
    val data_Int = 1 :: 2 :: 3 :: Nil

    println(data.isEmpty)
    println(data.head)
    println(data.tail.head)
    println(bigData_Core)

    val List(a, b) = bigData
    println("a : " + a + " === " + " b: " + b)
    val x :: y :: rest = data
    println("x : " + x + " === " + " y: " + y + " === " + rest)

    val shuffledData = List(6, 3, 5, 6, 2, 9, 1)
    println(sortList(shuffledData))

    def sortList(list: List[Int]): List[Int] = list match {
      case List() => List()//null
      case head :: tail => compute(head, sortList(tail))//递归
    }

    def compute(data: Int, dataSet: List[Int]): List[Int] = dataSet match {
      case List() => List(data)
      case head :: tail => if (data <= head) data :: dataSet
      else head :: compute(data, tail)
    }

    println(compute(6, shuffledData))

  }

}
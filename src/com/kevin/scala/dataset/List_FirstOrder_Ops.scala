package com.kevin.scala.dataset

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object List_FirstOrder_Ops {

  def main(args: Array[String]) {
    //:::List连接, ::元素连接
    println(List (1,2,3,4) ::: List (4,5,6,7,8) ::: List (10,11))  //list链接
    println(List (1,2,3,4) ::: (List (4,5,6,7,8) ::: List (10,11)))
    println(List (1,2,3,4).length)


    //改变list都会产生一个新的list
    val bigData = List("Hadoop" , "Spark" , "Kaffka")
    println(bigData.last)
    println(bigData.init)
    println(bigData.reverse)//list本身不可变,一次操作产生一个新的list
    println(bigData)
    println(bigData take 2)//取前两个
    println(bigData drop 1)//去除第一个元素
    println(bigData splitAt 2)//从第二个元素,拆分成两个list
    println(bigData apply 2)//取list中的制定元素
    println(bigData(2))//实际调用apply
    
    val data=List('a' ,'b', 'c', 'd', 'e', 'f')
    println(data.indices)
    println(data.indices zip data) //拉链操作,插位
    println(data.zipWithIndex)
    println(data.toString)
    println(data.mkString ("[", ",,", "]"))
    println(data.mkString ("******"))
    println(data mkString)
    
    val buffer = new StringBuilder
    data addString (buffer, "(", ";;", ")")
    println(buffer)
    println(data)
  
    val array = data.toArray
    println(array.toList)
    
    val new_Array = new Array[Char](10)
    data.copyToArray(new_Array,3)//跳过前三个位置
    new_Array.foreach(print)
    println
    
    val iterator = data.toIterator
    println(iterator.next)
    println(iterator.next)
  }

}
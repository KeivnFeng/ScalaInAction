package com.kevin.scala.dataset

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object List_Fold_Sort {

  def main(args: Array[String]){
    println((1 to 100).foldLeft(0)(_+_) ) //0+1+2+...+100
    println((0 /: (1 to 100))(_+_))//foldLeft另一种调用方法
    
    println((1 to 5).foldRight(100)(_-_))//(1-(2-(3-(4-(5-100)))))
    println(((1 to 5):\100)(_-_))
    
    
    println(List(1, -3, 4, 2, 6) sortWith (_ < _))//升
    println(List(1, -3, 4, 2, 6) sortWith (_ > _))//降
    
  }

}
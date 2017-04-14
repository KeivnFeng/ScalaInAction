package com.kevin.scala.oop

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
class University{
  val id = University.newStudenNo
  private var number =0
  def aClass(number:Int){this.number += number}
}

//类可以访问他的半生对象的所有属性包括private,但半生对象不属于类
object University{//scala中object在第一次被调用的时候才会加载,调用他的隐士构造器,不想java的静态方法,jvm运行就加载
  private var studentNo = 0
  def newStudenNo = {
    studentNo += 1
    studentNo
  }
}


object ObjecOps {

  def main(args: Array[String]): Unit = {
    
    println(University.newStudenNo)
    println(University.newStudenNo)
    
    
  }

}
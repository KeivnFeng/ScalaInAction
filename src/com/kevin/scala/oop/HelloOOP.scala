package com.kevin.scala.oop

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
class Person {
  private var age = 0
  def increment(){age += 1}
  def current = age
    
  
}

class Student{
  private var privateAge = 0
  private[this] var test = 0//当前对象私有，other就不能访问这个，不能被类当前对象的方法访问
  val name = "Scala"
  def age = privateAge  
  
  
  
  def isYounger(other: Student) = privateAge < other.privateAge
  //def isYounger2(other: Student) = test < other.test//对象私有属性
}

object HelloOOP {

  def main(args: Array[String]): Unit = {
    val person = new Person()
    person.increment()
    person.increment()
    println(person.current)
//    
//    val student = new Student
//    student.age = 10 //通过age函数给age赋值
//    println(student.age)//通过函数age取出age的值
    
    val student = new Student
    //student.name = "xxx"不能给val赋值
    println(student.name)
    
  }

}
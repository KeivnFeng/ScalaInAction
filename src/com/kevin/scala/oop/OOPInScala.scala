package com.kevin.scala.oop

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
//class Teacher {//scala的变量必须初始化，当然可以用占位符初始化
//  var name : String = _
//  private var age = 27
//  private[this] val gender = "male"//属于当前实例
//  
//  def this(name:String){//构造器
//    this//必须调用主构造器，主构造器就是类申明时后面申明的参数
//    this.name = name
//  }
//    
//  def sayHello(){
//    println(this.name + ":" + this.age + " : " + this.gender)
//  }
//}

class Teacher private (val name : String, val age : Int){
  println("This is the primary constructor!!!")
  var gender : String = _
  println(gender)
  def this(name : String, age : Int, gender : String){
    this(name, age)
    
    this.gender = gender
  }
}


class Outer(val name: String) { outer =>
            class Inner(val name: String){
              def foo(b:Inner) = println("Outer: " + outer.name + 
                  " Inner: " + b.name)
            }
            
        }
object OOPInScala{//内部类隶属于外部内实例本身(object),不像java,存储于外部类class
  def main(args: Array[String]) {
    
    val outer1 = new Outer("Spark")
    val outer2 = new Outer("Hadoop")
    val inner1 = new outer1.Inner("Scala")
    val inner2 = new outer2.Inner("Java")
    inner1.foo(inner1);
    inner2.foo(inner2);
    
//	  val p = new Teacher
//	  p.name = "Spark"
//	 
//	  p.sayHello
    
//	  val p = new Teacher("Spark", 5)//主构造private，私有化，不可用，类似于java构造方法私有化
//	  println(" : " + p.age)
    
//    val p = new Teacher("Spark", 5 , "male")
//    println(" : " + p.age)
    
    
  }
  
  
}
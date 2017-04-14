package com.kevin.scala.oop

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
class UseTrait {

}

trait Logger{
//  def log (msg : String) //和java interface很像, 但阔以有实现的方法
  def log (msg : String){}
}

class ConcreteLogger extends Logger with Cloneable{//多个trait用with
  
//  override def log(msg : String) = println("Log: " + msg)
  
  def concreteLog{
    log("It's me !!!")
  }
}

trait TraitLogger extends Logger{
  override def log (msg : String){
    println(" TraitLogger Log content is : " + msg)
  }
}

trait TraitLoggered{
	def loged (msg : String){
		println("TraitLoggered Log content is : " + msg)
	}
}

trait ConsoleLogger extends TraitLogger{//trait继承
  override def log(msg : String){
    println("Log from Console :" +msg)
  }
}

class Test extends ConsoleLogger{
  def test{
    log("Here is Spark!!!")
  }
  
}

abstract class Account{
  def save
}

class MyAccount extends Account with ConsoleLogger{
  def save{
    log("11")
  }
}

class Human{
  println("Human")
}
trait TTeacher extends Human {  
  println("TTeacher")
  def teach 
}  
trait PianoPlayer extends Human {  
  println("PianoPlayer")
  def playPiano = {println("I��m playing piano. ")} 
}  
class PianoTeacher extends Human with TTeacher with PianoPlayer { //构造顺序由左往右,如果前面有后面trait或类的父类,那么在构造后面类的时候不会再次构造父类,TTeacher,PianoPlayer不会再构造Human
	override def teach = {println("I��m training students. ")} 
}


//AOP
trait Action {  
	def doAction  
}
trait TBeforeAfter extends Action {  
	abstract override def doAction {  
		println("Initialization") 
		super.doAction   //任然抽象
		println("Destroyed") 
	}  
}

class Work extends Action{
 override def doAction = println("Working...")
}

object UseTrait extends App{
//   val t1 = new PianoTeacher 
//   t1.playPiano  
//   t1.teach  
//   val t2 = new Human with TTeacher with PianoPlayer {  
//      def teach = {println("I'm teaching students.")} } 
//   t2.playPiano
//   t2 teach 
   val work = new Work with TBeforeAfter
   work.doAction
//  val logger = new ConcreteLogger with TraitLogger//混入其他实现,其他trait
////  val logger = new ConcreteLogger
//  logger.concreteLog
//	val logger = new Test
//	logger.test;
//  
//  val account = new MyAccount with TraitLoggered
//  account.save

  
}
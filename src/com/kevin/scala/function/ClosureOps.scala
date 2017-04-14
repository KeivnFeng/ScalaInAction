package com.kevin.scala.function

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object ClosureOps {//闭包
	def main(args: Array[String]) {
		val data = List(1, 2, 3, 4, 5, 6)
		var sum = 0
		data.foreach(sum += _)
		
		def add(more: Int) = (x: Int) => x + more
		val a = add(1)//闭包more
		val b = add(9999)
		println(a(10)) //传入x
		println(b(10))
	}
}
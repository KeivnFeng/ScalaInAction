package com.kevin.scala.basic

object ForFunctionAdvanced {
  def main(args: Array[String]): Unit = {//Unit返回类似void
    for(i <- 1 to 2; j <- 1 to 2) print(100 * i + j + "  ")//有点像二维数组循环
    println
    for(i <- 1 to 2; j <- 1 to 2 if i != j) print(100 * i + j + "  ")
    
    println
    
    //函数本身有值，所以函数可以作为参数传递给函数
    def addA(x : Int) = x + 100
    val add = (x : Int) => x + 200
    println("The result from a function is : " + addA(2))
    println("The result from a val is : " + add(2))
    
    def fac(n : Int):Int = if(n <= 0) 1 else n * fac(n - 1)
    println("The result from a fac is : " + fac(10))
    
    
    //默认值，如果手动赋值，则会覆盖默认值
    def combine(content:String, left:String = "[", right:String = "]") = left + content + right
    println("The result from a combin is :" + combine("I love Spark", ">>", "<<"))
    
    def connected(args: Int*) = {//可变参数
      var result = 0
      for(arg <- args) result += arg
      result
    }
    
    println("The result from a connected is : " + connected(1,2,3,4,5))
    println("The result from a connected is : " + connected(1,2,3,4,5,6))
  }
}
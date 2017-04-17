package com.kevin.scala.basic

import scala.io.Source

object LazyOps {
  def main(args: Array[String]){
    lazy val file = Source.fromFile("D:\\test.txt")//延迟加载
    for(line <- file.getLines) println(line)//在实际使用的时候才会读取文件
  }
}
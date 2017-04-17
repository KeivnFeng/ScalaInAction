package com.kevin.scala.basic

import scala.io.Source

object FileOperations {
  def main(args: Array[String]) {
    val file = Source.fromFile("D:\\test.txt");
    //val file = Source.fromURL("http://www.baidu.com");
    for(line <- file.getLines){
      println(line)
    }
  }
}
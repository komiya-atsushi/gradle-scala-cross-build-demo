package biz.k11i.scala.demo

import org.json4s.native.JsonMethods

object Bar {
  def main(args: Array[String]): Unit = {
    println("Bar")
    println(JsonMethods.parse("""{"hello":"world"}"""))
  }
}

object NoneCaseClass {

  def main(args: Array[String]): Unit = {
    val domain1 = new Domain4(1, "富樫")
    val domain2 = domain1

    println("==:", domain1 == domain2)
    println("!=:", domain1 != domain2)

    val domain3 = new Domain4(2, "虎丸")

    println("==:", domain1 == domain3)
    println("!=:", domain1 != domain3)

  }

  class Domain4(val id: Long, val name: String)
}

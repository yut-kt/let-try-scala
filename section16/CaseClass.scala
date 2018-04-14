object CaseClass {

  def main(args: Array[String]): Unit = {
    val domain1 = new Domain3(1, "富樫")
    val domain2 = new Domain3(1, "富樫")

    println("==:", domain1 == domain2)
    println("!=:", domain1 != domain2)

    val domain3 = new Domain3(2, "虎丸")

    println("==:", domain1 == domain3)
    println("!=:", domain1 != domain3)

  }

  case class Domain3(val id: Long, val name: String)
}

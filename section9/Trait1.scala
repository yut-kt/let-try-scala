object Trait1 {
  def main(args: Array[String]) {
    val man = new Man
    man.say()
  }
}

trait Human {
  val name = "飛行帽"

  def sayName() {
    println("My name is " + name)
  }
}

class Man extends Human

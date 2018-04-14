object Trait2 {
  def main(args: Array[String]){
    val man = new Man("虎丸龍次", "男塾", "一号生")
    man.say()
  }
}

trait Human {
  val name: String
}

trait Job {
  val job: String
}

trait Grade {
  val grade: String
}

class Man(n: String, j: String, g: String) extends Human with Job with Grade {
  val name = n
  val job = j
  val grade = g

  def say() {
    println("名前は" + this.name + "じゃ。" + job + grade + "じゃ。")
  }
}

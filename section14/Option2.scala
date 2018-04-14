// oがヌルポでエラー
object Option2 {

  def main(args: Array[String]): Unit = {
    val map = Map(1 -> "Moses", 2 -> "Lucas", 3 -> "Henderson")

      def check(o: Option[String]) {
        o match {
          case Some(s) => println(s)
        }
      }

    val some = map get (2)

    check(some)
  }

}

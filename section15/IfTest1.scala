import java.io.File

object IfTest1 {

  def main(args: Array[String]): Unit = {
    var filename = "config.txt"

    if (!args.isEmpty) {
      filename = args(0)
    }

    println("Filename:" + filename)
  }
}

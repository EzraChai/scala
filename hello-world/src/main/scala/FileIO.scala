import scala.io.Source
import java.io.{PrintWriter,File}

object FileIO {
  def main(args: Array[String]):Unit = {
    Source.fromFile("/home/ezrachai/Documents/code/scala/hello-world/src/main/resources/test.txt").foreach(print)

    val writter  = new PrintWriter(new File("/home/ezrachai/Documents/code/scala/hello-world/src/main/resources/output.txt"))
    writter.write("Zoewin Tan")
    writter.close()
  }
}

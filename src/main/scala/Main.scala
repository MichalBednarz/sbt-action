import scala.io.Source

object Main extends App {
  val content = getClass.getResourceAsStream("test.txt")
  val lines = Source.fromInputStream(content).getLines()
  lines.foreach(println(_))
}

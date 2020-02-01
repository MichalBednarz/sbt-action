import scala.io.Source

object Main extends App {
  val content = getClass.getResourceAsStream("review-comments.json")
  val lines = Source.fromInputStream(content).getLines()
  lines.foreach(println(_))
}

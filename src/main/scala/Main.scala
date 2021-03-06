import scala.io.Source
import java.nio.file.Paths
object Main extends App {
  val source =
    Source.fromFile(Paths.get("ReviewComments.json").toAbsolutePath.toFile)
  try {
    val lines = source.getLines()
    lines.foreach(println(_))
  } finally {
    source.close
  }
}

import scala.collection.mutable.Map

val treasureMap = Map[Int, String]()

treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on island")

println(treasureMap(2))

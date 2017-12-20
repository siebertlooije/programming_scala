import scala.io.Source

def widthOfLength(s: String) = s.length.toString.length

if (args.length > 0){
	val lines = Source.fromFile(args(0)).getLines().toList
	var maxWidth = 0
	for (line <- lines)
		maxWidth = maxWidth.max(widthOfLength(line))
	for (line <- lines){
		val numSpaces = maxWidth - widthOfLength(line)
		val padding = " " * numSpaces
		println(padding + line.length + "|" + line)
	}
}
else
	Console.err.println("Please enter filename")

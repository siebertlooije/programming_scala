val firstArg = if(!args.isEmpty) args(0) else ""

val friend = firstArg match{
	case "salt" => "peper"
	case "chips" => "salsa"
	case "eggs" => "bacon"
	case _ => "huh?"
	}
println(friend)		

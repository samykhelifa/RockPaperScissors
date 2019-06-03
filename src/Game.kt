fun main() {
   val options = arrayOf("Rock","Paper","Scissors")
   val gameChoice = getGameChoice(options)
   println(gameChoice)
}
fun getGameChoice(optionsParam: Array<String>):String =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

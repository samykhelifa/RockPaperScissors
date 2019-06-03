fun main() {
   val options = arrayOf("Rock","Paper","Scissors")
}
fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

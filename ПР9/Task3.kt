fun main() {
    // Конвертация долларов в евро

    fun convert(dollars: Double){
        val oneDollarToEvro = 0.91161
        val evro = oneDollarToEvro * dollars

        println("$dollars долларов = $evro евро")
    }

    convert(10.0)
}
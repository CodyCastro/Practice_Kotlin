import kotlin.system.exitProcess

// Игра в 21

fun main() {
    var playerScore = 0 // Очки игрока
    var enemyScore = 0 // Очки соперника

    // Пробелы в интерфейсе
    val spaces = "" //                //

    // Проигрыш
    fun defeat(){
        println("Вы проиграли! Ваши очки: $playerScore")
        println("Очки соперника: $enemyScore")
        exitProcess(-1)
    }

    // Выигрышь
    fun win(){
        println("Вы выиграли! Очки соперника: $enemyScore.")
        exitProcess(-1)
    }

    // Завершить игру (открыть карты)
    fun endgame(){
        if(enemyScore < playerScore){
            println("Вы выиграли! Очки соперника: $enemyScore.")
            exitProcess(-1)
        }
        else if(enemyScore == playerScore){
            println("Ничья! Очки соперника: $enemyScore")
            exitProcess(-1)
        }
        else{
            println("Вы проиграли! Ваши очки: $playerScore \nОчки соперника: $enemyScore.")
            exitProcess(-1)
        }
    }

    // Соперник получает карты
    fun enemyGetCard(quantity: Int){
        var card: Int // Вид карты. Используется при рандомном выборе карты.

        // Получение карт
        for(i in 1..quantity){
            card = (1..10).random()

            // Определение вида карты
            when(card){
                in 1..10 -> {
                    enemyScore += card
                }
                11 -> {
                    enemyScore += 2
                }
                12 -> {
                    enemyScore += 3
                }
                13 -> {
                    enemyScore += 4
                }
            }
        }

        if(enemyScore > 21){
            win()
        }
    }

    // Игрок получает карты (quantity - количество карт)
    fun playerGetCard(quantity: Int){
        var card: Int // Вид карты. Используется при рандомном выборе карты.
        var randSuit: Int // Масть карты
        var suit = "?"

        // Получение карт
        for(i in 1..quantity){
            card = (1..10).random()
            randSuit = (1..4).random()

            println("Получена карта:")

            // Определение масти карты
            when(randSuit){
                1 -> suit = "♣"
                2 -> suit = "♠"
                3 -> suit = "♥"
                4 -> suit = "♦"
            }

            // Определение вида карты
            when(card){
                in 1..10 -> {
                    println("$suit$card")
                    playerScore += card
                }
                11 -> {
                    println("${suit}Валет")
                    playerScore += 2
                }
                12 -> {
                    println("${suit}Дама")
                    playerScore += 3
                }
                13 -> {
                    println("${suit}Король")
                    playerScore += 4
                }
            }
        }

        // Продолжение игры, выбор последующего действия
        fun gameCheck(){

            // Условия проигрыша
            if(playerScore > 21){
                defeat()
            }
            else if(playerScore > 21 && enemyScore <= 21){
                endgame()
            }
            else if(enemyScore >= 19){
                println("\nСоперник открывается")
                endgame()
            }

            println("$spaces+------------------+\n" +
                    "$spaces    Ваши очки: $playerScore")

            // 1 - взять карту
            // 2 - открыться

            print("" +
                    "${spaces}+------------------+\n" +
                    "${spaces}| 1 -> взять карту |\n" +
                    "${spaces}| 2 -> открыться   |\n" +
                    "${spaces}+------------------+\n" +
                    "${spaces}Выберите действие: ")

            // выбор действия
            val action = readln().toInt()
            println()

            when(action){
                1 -> {
                    enemyGetCard(1)
                    playerGetCard(1)
                }
                2 -> endgame()
            }
        }
        gameCheck()
    }

    fun game(){
        // Начало игры
        enemyGetCard(2)
        playerGetCard(2)
    }

    game()
}
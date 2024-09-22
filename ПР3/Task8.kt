fun main() {
    val kilometers = 23.5f
    val feet = 25.45f
    val footInMeter = 0.305f

    println("Расстояние A: $kilometers км")
    println("Расстояние A: $feet футов")

    if(feet*footInMeter/1000 > kilometers)
    {
        println("${feet * footInMeter / 1000} > $kilometers\n" +
                "Расстояние B - больше")
    }
    else{
        println("$kilometers > ${feet * footInMeter / 1000}\n" +
                "Расстояние A - больше")
    }
}
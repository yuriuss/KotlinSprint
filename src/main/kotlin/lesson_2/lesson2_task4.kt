package lesson_2

fun main() {
    var buffInPercentage = 20.0
    val crystalOre = 7
    val ironOre = 11

    val bonusCrystalOre = (crystalOre * (buffInPercentage / 100)).toInt()
    val bonusIronOre = (ironOre * (buffInPercentage / 100)).toInt()

    println("Бонусная кристаллическая руда: $bonusCrystalOre")
    println("Бонусная железная руда: $bonusIronOre")
}
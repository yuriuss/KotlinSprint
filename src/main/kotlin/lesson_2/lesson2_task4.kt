package lesson_2

fun main() {
    val buffInPercentage = .2
    val crystalOre = 7
    val ironOre = 11

    val bonusCrystalOre = (crystalOre * buffInPercentage).toInt()
    val bonusIronOre = (ironOre * buffInPercentage).toInt()

    println("Бонусная кристаллическая руда: $bonusCrystalOre")
    println("Бонусная железная руда: $bonusIronOre")
}
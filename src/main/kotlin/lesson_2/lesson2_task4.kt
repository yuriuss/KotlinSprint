package lesson_2

const val BUFF_IN_PERCENTS = 20

fun main() {
    val crystalOre = 7
    val ironOre = 11

    val crystalOreWithBuff = crystalOre + (7 * BUFF_IN_PERCENTS) / 100
    val ironOreWithBuff = ironOre + (ironOre * BUFF_IN_PERCENTS) / 100

    println("$crystalOreWithBuff crystal ore was mined (+$BUFF_IN_PERCENTS%)")
    println("$ironOreWithBuff iron ore was mined (+$BUFF_IN_PERCENTS%)")
}
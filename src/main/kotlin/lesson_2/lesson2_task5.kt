package lesson_2

import kotlin.math.pow

fun main() {
    var clientSum = 70_000
    var interestRate = 16.7
    var depositeTime = 20
    val finalAmount = clientSum * (1 + (interestRate / 100)).pow(depositeTime)

    println("%.3f".format(finalAmount))
}
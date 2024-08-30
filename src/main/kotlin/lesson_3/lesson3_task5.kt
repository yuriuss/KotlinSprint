package lesson_3

fun main() {
    val receivedStep = "D2-D4;0"

    val stepFrom = receivedStep.split("-")[0]
    val stepTo = receivedStep.split("-")[1].split(";")[0]
    val numberOfStep = receivedStep.split(";")[1]

    println(stepFrom)
    println(stepTo)
    println(numberOfStep)
}
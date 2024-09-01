package lesson_3

fun main() {
    val receivedStep = "D2-D4;0"

    val parsedSteps = receivedStep.split("-", ";")
    val stepFrom = parsedSteps[0]
    val stepTo = parsedSteps[1]
    val numberOfStep = parsedSteps[2]

    println(stepFrom)
    println(stepTo)
    println(numberOfStep)
}
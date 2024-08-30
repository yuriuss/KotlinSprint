package lesson_3

fun main() {
    var stepFrom = "E2"
    var stepTo = "E4"
    var numberOfStep = 1

    println("[$stepFrom-$stepTo;${numberOfStep++}]")
    stepFrom = "D2"
    stepTo = "D3"
    println("[$stepFrom-$stepTo;$numberOfStep]")
}
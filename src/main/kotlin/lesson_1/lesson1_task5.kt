package lesson_1

fun main() {
    val seconds : Short = 6480

    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val remainingSeconds = seconds % 60

    println("$hours:$minutes:$remainingSeconds")
}
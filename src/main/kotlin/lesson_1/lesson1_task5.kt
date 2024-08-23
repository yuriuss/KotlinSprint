package lesson_1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val seconds : Short = 6480

    val hours = seconds / SECONDS_IN_HOUR
    val minutes = (seconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val remainingSeconds = seconds % SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, remainingSeconds))
}
package lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val trainDepartHour: Int = 9
    val trainDepartMinute: Int = 39
    val travelTime: Int = 457

    val totalDepartMinutes = trainDepartHour * MINUTES_IN_HOUR + trainDepartMinute
    val totalTravelTimeMinutes = totalDepartMinutes + travelTime

    val trainArrivalHour = totalTravelTimeMinutes / MINUTES_IN_HOUR
    val trainArrivalMinutes = totalTravelTimeMinutes - trainArrivalHour * MINUTES_IN_HOUR
    println("%02d:%02d".format(trainArrivalHour, trainArrivalMinutes))
}
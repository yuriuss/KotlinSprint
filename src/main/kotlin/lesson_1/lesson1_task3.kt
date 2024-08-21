package lesson_1

/**
 * О первом полёте Юрия Гагарина в космос
 */
fun main() {
    val year = 1964
    var hour = "09"
    var minute = "07"

    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"
    print("$hour:") // можно так
    println(minute)
    println("$hour:$minute") // или так
}
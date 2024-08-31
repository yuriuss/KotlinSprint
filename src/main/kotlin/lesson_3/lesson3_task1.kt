package lesson_3

fun main() {
    var username = "Вася"
    val welcomeMessage = "Добрый %s, $username"

    println(welcomeMessage.format("день"))
    println(welcomeMessage.format("вечер"))
}
package lesson_2

const val COUNT_OF_STUDENTS = 4.0

fun main() {
    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5

    val averageScore = (student1 + student2 + student3 + student4) / COUNT_OF_STUDENTS
    println("%.2f".format(averageScore))
}
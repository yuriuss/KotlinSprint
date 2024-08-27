package lesson_2

fun main() {
    val employees = 50
    val employeesSalary = 30000.0
    val interns = 30
    val internsSalary = 20000.0

    val employeesPaymentExpenses = employees * employeesSalary
    val commonPaymentExpenses = employeesPaymentExpenses + (interns * internsSalary)
    val averageSalaryAfterInternsCome = commonPaymentExpenses / (employees + interns)

    println(employeesPaymentExpenses)
    println(commonPaymentExpenses)
    println(averageSalaryAfterInternsCome)
}
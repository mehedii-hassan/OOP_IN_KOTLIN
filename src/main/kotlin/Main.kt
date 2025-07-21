package org.example

fun main() {
    val baseSalariedEmployee = BaseSalariedEmployee(100000, "Mehedi", "Hassan")
    val hourlySalariedEmployee = HourlySalariedEmployee(500, 100, "Mehedi", "Hassan")
    /* println(baseSalariedEmployee.getFullInfo())
     println(hourlySalariedEmployee.getFullInfo())*/

    val employees: List<Employee> = listOf(baseSalariedEmployee, hourlySalariedEmployee)
    for (employee in employees) {
        //Runtime polymorphism
        println(employee.getFullInfo())
    }
}

abstract class Employee(val firstName: String, val lastName: String) {
    abstract fun getFullInfo(): String
}

class BaseSalariedEmployee(var salary: Int, fName: String, lName: String) : Employee(fName, lName) {

    //Method overriding instead of create new getFullInformation()
    override fun getFullInfo() = "$firstName $lastName draws $salary taka per month"
}

class HourlySalariedEmployee(var hourlyRate: Int, var totalHour: Int, fName: String, lName: String) :
    Employee(fName, lName), Allowance {

    //Method overriding instead of create new getFullInformation()
    override fun getFullInfo() = "$firstName $lastName draws $hourlyRate taka per hour"
    override fun calculateAllowance() {
        TODO("Not yet implemented")
    }
}

interface Allowance {
    fun calculateAllowance()
}
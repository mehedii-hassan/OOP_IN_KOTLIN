package org.example

fun main() {
    val baseSalariedEmployee = BaseSalariedEmployee(100000, "Mehedi", "Hassan")
    println(baseSalariedEmployee.getFullInfo())
}

open class Employee(val firstName: String, val lastName: String) {
    open fun getFullInfo() = "$firstName $lastName"
}

class BaseSalariedEmployee(val salary: Int, fName: String, lName: String) : Employee(fName, lName) {

    //fun getFullInformation() = "$firstName $lastName draws $salary taka per month"

    //Method overriding instead of create new getFullInformation()
    override fun getFullInfo() = "$firstName $lastName draws $salary taka per month"

}
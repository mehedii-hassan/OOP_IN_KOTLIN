package org.example

fun main() {
    println(Calculator.pi)
    val a = B()
    a.a()

//Another way to give default implementation for abstract methods
    val ob: A = object : A() {
        override fun a() {
            println("Default implementation for abstract method")

        }

    }
    ob.a()
    val callback: Callback = object : Callback {
        override fun call() {
            println("Default implementation for abstract method using interface")
        }

    }
    callback.call()


}

class Calculator {
    companion object Constants {
        val pi = 3
    }
}


abstract class A {
    abstract fun a()
}

interface Callback {
    fun call()
}

//First way to give default implementation for abstract methods
class B : A() {
    override fun a() {
        println("I am class B")
    }

}
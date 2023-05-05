package com.kotlin.classes

class Person {

    fun action(){
        println("Person Walks")
    }
}

fun main() {
    val person = Person() // new keyword is not required in Kotlin to create an instance of a class
    person.action()
}
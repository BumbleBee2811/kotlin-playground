package com.kotlin.classes

class PersonWithPrimaryConstructor(
    val name: String = "",
    val age: Int = 0
) {

    var email: String = ""
    var nameLength: Int = 0

    //init block is used to run some initialization logic during the instance cretion
    init {
        println("Inside init block")
        nameLength = name.length
    }

    constructor(
        email: String = "",
        name: String = "",
        age: Int = 0
    ) : this(name, age) {
        this.email = email
    }

    fun action() {
        println("Person Walks")
    }
}

fun main() {
    val person = PersonWithPrimaryConstructor("Dibyajyoti", 30)
    person.action()
    println("Name : ${person.name} and the age is ${person.age}")

    //Person object with default values
    val person1 = PersonWithPrimaryConstructor()
    person1.action()
    println("Name : ${person1.name} and the age is ${person1.age}")

    val person2 =
        PersonWithPrimaryConstructor(email = "dibyajyoti.dash@gmail.com", name = "Dibyajyoti Dash", age = 30)
    println(
        "Name : ${person2.name} and the age is ${person2.age}"
                + " and email is ${person2.email}"
                + " and name length is ${person2.nameLength}"
    )
}
package com.kotlin.classes

// open keyword is used to make a class extendable
open class User(
    val name: String
) {
    open var isLoggedIn: Boolean = false
    open fun login(){
        println("Inside user login")
    }
}
// In Kotlin, a class can not extend to multiple classes
//Student class extends the User class
class Student(name: String) : User(name){
    override var isLoggedIn: Boolean = false

    //Companion object
    // Referred to static in Java
    companion object {
        fun country() = "India"
        val state : String = "Odisha"
    }
    override fun login(){
        println("Inside Student login")
    }
}

//Instructor class extends the User class
class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Alex")
    println("name is ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged In value is ${student.isLoggedIn}")

    val country  = Student.country()
    println("Country is : $country")
    println("State is : ${Student.state}")

    val instructor = Instructor("Dibyajyoti")
    println("name is ${instructor.name}")
    instructor.login()
}
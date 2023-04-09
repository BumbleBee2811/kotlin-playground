package com.kotlin.functions

/**
 * Top Level Functions:
 *
 * Functions that do not belong to any class are known as 'top-level functions'
 *
 * In Java, functions can only be a part of a class
 *
 * In Java applications, we can find classes that just has some static methods which holds some
 * common logic that can be used across the application i.e. Utility methods
 *
 * Kotlin avoids this by using top level functions that can be a part of a Kotlin file and not a class
 *
 * Top Level Properties:
 *
 * In Kotlin, the properties that does not belong to class are called top-level properties
 *
 * In Java, we can define properties is a class or an interface
 *
 * Most common use case in a Java Application is we may have to define static constants in a class
 * that can be used across the app
 *
 * Kotlin avoids this by allowing us to create properties that can be a part of Kotlin file and not any class
 */

const val courseName = "Kotlin Programming"

fun topLevelFunction() : Int {
    return (0..100).random()
}
fun main() {
    println("Num is ${topLevelFunction()}")
}
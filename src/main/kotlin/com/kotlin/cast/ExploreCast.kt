package com.kotlin.cast

import com.kotlin.classes.Course

fun checkType(type: Any) {
    when(type) {
        is Course -> {
            println(type)
        }
        is String -> {
            println(type.lowercase())
        }
    }
}

fun castNumber(type: Any) {

    when(type) {
        type as Double -> println("Value is Double")
    }

}

fun main() {

    val course = Course(1,"Reactive Programming in Modern Java using Project Reactor","Dilip")

    checkType(course)
    checkType("DIBYAJYOTI")
    castNumber(1.0)
}



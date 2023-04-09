package com.kotlin.basics

import com.kotlin.functions.courseName
import com.kotlin.functions.topLevelFunction

/**
 *  Variable declared with 'val' are immutable i.e. values can't be changed after assigning
 *  ex - val name : String = "Dibyajyoti"
 *
 *  Variable declared with 'var' are mutable i.e. values can be changed after assigning
 *  ex - var name : String = "Dibyajyoti"
 */
fun main() {
    val name : String = "Dibyajyoti"
    println(name)
//    name = "Dash"
//    Above line will be an compilation error
    var age : Int = 30
    println(age)
    age = 31
    println(age)
    println("Num is ${topLevelFunction()}")
    println("Course is $courseName")
}

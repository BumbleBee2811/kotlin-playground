package com.kotlin.basics

/**
 * In Kotlin, there is no distinction between primitive and wrapper types
 * All numbers in kotlin are represented as types
 *      Integer types - Byte, Short, Int, Long
 *      Floating-Point types - Float, Double
 *      Character type - Char
 *      Boolean type - Boolean
 */
fun main() {
    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("Course : $course and the course length is ${course.length}")

    val multiline = "ABD \n DEF"
    println(multiline)

    val multiline1 = """
        ABC
        DEF
    """.trimIndent()
    println(multiline1)
}
package com.kotlin

fun main() {
    /**
     * range can be created by specifying a starting and ending value separated by two dots '..'
     * ex - val range = 1..10
     */

    // Simple loop over a range
    val range = 1..10
    for (i in range)
        println("range : $i")

    // Reverse range
    val reverseRange = 10 downTo 1 // or 10..1
    for (i in reverseRange)
        println("reverse range : $i")

    // Skipping values in iteration
    for (i in reverseRange step 2) //
        println("reverse range with skip: $i")
}
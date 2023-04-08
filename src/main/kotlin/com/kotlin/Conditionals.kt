package com.kotlin

fun main() {
    val name = "Happy"
    val result = if (name.length == 4) {
        println("Name is four characters")
        name
    } else {
        println("Name is not four characters")
        name
    }

    println("result : $result")

    //  1 -> GOLD, 2 -> SILVER, 3 -> BRONZE

    val position = 1

    /**
     * if-else is an expression in kotlin
     * expression always returns a value
     */

    /*val medal = if (position == 1)
        "GOLD"
    else if (position == 2)
        "SILVER"
    else if (position == 3)
        "BRONZE"
    else
        "NO MEDAL"*/

    /**
     * when block allows us to write concise and expressive code when dealing with multiple conditions
     */
    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println(medal)

}
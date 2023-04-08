package com.kotlin

fun main() {
    for (i in 1..5) {
        println("i in $i")
        if (i == 3)
            break
        // we can use 'return'. When we use return, the lines below will not be executed
        // the program will return from the main function

    }

    label()
    println("End of th program!")
}

fun label() {
    loop@ for (i in 1..5) {
        println("i in label $i")
//        if (i == 3) break@loop
        innerloop@ for (j in 1..5) {
            println("j in label $j")
//            if (j ==2) break@innerloop
            // Alter
            if (j == 2) continue@loop
        }

    }
}

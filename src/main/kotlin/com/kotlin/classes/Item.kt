package com.kotlin.classes

import java.lang.IllegalArgumentException

class Item() {
    var name: String = ""
    var price: Double = 0.0
        get() {
            println("Inside getter")
            return field
        }
        set(value) {
            if (value >= 0.0)
                field = value
            else
                throw IllegalArgumentException("Negative price is not allowed")
        }

    constructor(name: String) : this() {
        this.name = name
    }
}

fun main() {
    val item = Item("Iphone")
    println("Item name is ${item.name}")
    item.name = "iPhone 13"
    println("Item name is ${item.name}")
    item.price = 10.0
    println(item.price)

    println("Hello" + " Kotlin")
}
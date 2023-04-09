package com.kotlin.functions

import java.time.LocalDate

fun main() {
    printName("Dibyajyoti")
    val result = addition(1, 2)
    println("Result is : $result")
    val resultApproachOne = additionApproachOne(1, 2)
    println("Result with approach one is : $resultApproachOne")
    printPersonDetails("Dilip","abc@gmail.com", LocalDate.parse("1992-11-28"))
    printPersonDetails("Dilip") // Default values will be used for the parameters which are not passed
    printPersonDetails(name = "Sambit", dob = LocalDate.parse("2007-03-31"))
    printPersonDetails(dob = LocalDate.parse("2007-03-31"), name = "Sonu", email = "sonu@gmail.com")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

/**
 * Return type is automatically inferred by the method body
 */
fun additionApproachOne(x: Int, y: Int) = x + y

/**
 * 'Unit' is a type which mean that the function is not going to return anything
 *
 * Unit corresponds to void type in Java
 */
fun printName(name: String): Unit {
    println("Name is : $name")

}

/**
 * Default value parameters:
 *
 *      We can provide a default value to the function parameter when it is not passed by the caller
 */
fun printPersonDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
) {
println("""
    Name is $name
    Email is $email
    Date of birth is $dob
""".trimIndent())
}

/**
 * Named Arguments:
 *
 *      The caller can invoke the function by using the variable name
 *
 *      Caller can invoke the function using the name of the function arguments, in no particular order
 *
 *      ex -
 *          printPersonDetails(dob = LocalDate.parse("2000-01-01"), name = "Dibyajyoti", email = abc@xyz.com)
 */



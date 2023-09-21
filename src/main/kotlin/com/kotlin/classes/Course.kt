package com.kotlin.classes

/**
 * Data classes are primarily for classes that are going to behave as data container
 *
 * It automatically generates a lot of functionalities for us when we add the data modifier to the class
 *
 * It is pretty easy to create a clone of the object using the copy() function
 */
data class Course(
    val id: Int,
    val name: String,
    val author: String,
    val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING

}

fun main() {
    val course = Course(1, "Reactive Programming in Modern Java using Project Reactor", "Dilip")
    println(course)
    val course1 = Course(1, "Reactive Programming in Modern Java using Project Reactor", "Dilip")
    println("Checking object equality : ${course == course1}")

    // creates a clone of course1 and stored in course2 object and the values are updated
    val course2 = course1.copy(
        id = 2, name = "xyzz", author = "Anonymous"
    )
    println(course2)

    val marketingCourse = Course(
        2,
        "Facebook Marketing",
        "Dibyajyoti",
        CourseCategory.MARKETING
    )
    println(marketingCourse)
}
package com.kotlin.interfaces

import com.kotlin.classes.Course

interface CourseRepository {

    val isCoursePersisted : Boolean
    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("course : $course")
        return course.id
    }
}

interface Repository {
    fun getAll() : Any
}

class SqlCourseRepository : CourseRepository, Repository {

    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(
            id,
            "Reactive Programming in Modern Java using Project Reactor",
            "Dilip"
        )
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }
    override fun getAll(): Any {
        return 1
    }
}

class NoSqlCourseRepository : CourseRepository {
    override val isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(
            id,
            "Reactive Programming in Modern Java using Project Reactor",
            "Dilip"
        )
    }

    override fun save(course: Course): Int {
        println("course in NoSqlRepository : $course")
        return course.id
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course is $course")
    var courseId  = sqlCourseRepository.save(
        Course(
            5,
            "Reactive Programming in Modern Java using Project Reactor",
            "Dilip"
        )
    )
    println("Course Persisted values is : ${sqlCourseRepository.isCoursePersisted}")
    println("Saved Course Id : $courseId")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course1 = noSqlCourseRepository.getById(2)
    println("Course is $course1")

    courseId  = noSqlCourseRepository.save(
        Course(
            6,
            "Reactive Programming in Modern Java using Project Reactor",
            "Dilip"
        )
    )
    println("Saved Course Id in NoSqlRepository : $courseId")
}
package oop

open class Being
open class Person : Being()
class Student : Person()

fun main() {

    // Covariance = we can use a "more derived" type (a subtype)

    val people: MutableList<Person> = mutableListOf(Person(), Person())
    people.add(Student())

    // Being doesn't fulfill the contract of class Person
    // people.add(Being()) - contravariance

    val p: Person = Student() // covariance

    // Read-only collections are covariant
    val students: List<Person> = listOf<Student>() // covariance

    // val students2: MutableList<Person> = mutableListOf<Student>()
    // students2.add(Person())

    



}
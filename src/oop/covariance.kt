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

    // Using Kotlin TimeSeries
    val events: TimeSeries<Person> = timeSeriesOf()
    val students3: List<Student> = listOf(Student(), Student())
    events.addAll(students3) // covariance

    // Using Java TimeSeries
    val chartData: JavaTimeSeries<Person> = JavaTimeSeries()
    chartData.add(Student()) // covariance
    chartData.addAll(students3) // covariance

}
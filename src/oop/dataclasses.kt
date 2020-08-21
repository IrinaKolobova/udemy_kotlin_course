package oop

// Generates hashCode(), equals(), toString(), copy(), destructuring operator
data class Address(val street: String, val number: Int, val postCode: String, val city: String)

fun main() {
    val residence = Address("Main street", 42, "1234", "New York")
    val residence2 = Address("Main street", 42, "1234", "New York")

    // toString()
    println(residence)

    // referential equality
    println(residence === residence2) // equivalent of == in Java

    // Structural equality
    println(residence == residence2) // equivalent of equals() in Java

    // copy()
    val neighbor = residence.copy(number = 43)
    println(neighbor)

    // Destructuring operator
    residence.component1()
    val (street, number, _, city) = residence
    println("$street $number, $city")
}
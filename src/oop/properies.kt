package oop

class City {

    var name: String = ""
        // every property in a Kotlin class has implicit backing field
        // in which it stores the actual data

        // default implementation for the getter:
        get() = field // get will return the stored value
        // default implementation for the setter:
        set(value) {
            field = value
        }

    var population: Int = 0
}

fun main() {
    val berlin = City()
    berlin.name = "Berlin" // implicitly calls the setter of the name property in order to set the value
    berlin.population = 3_500_000

    println(berlin.name) // implicitly calls the getter of the name property
    println(berlin.population)
}
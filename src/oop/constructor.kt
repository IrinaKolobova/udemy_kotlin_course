package oop

class Country(val name: String, val areaSqKm: Int) {

    // java way:
    /*val name: String
    val area: Int*/

    // init going to be executed
    // whenever a new object of the class is created
    // (when constructor is called)
    /*init{
        this.name = name
        this.area = areaSqKm
    }*/

    // secondary constructor:
    constructor(name: String) : this(name, 0){
        println("secondary constructor called")
    }
    fun print() = "$name, $areaSqKm km2"
}

fun main() {
    val australia = Country("Australia", 7_700_000)

    println(australia.name)
    println(australia.areaSqKm)

    val spain = Country("Spain")
    println(spain.name)
    println(spain.areaSqKm)
}
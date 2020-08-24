package oop

abstract class Vehicle(open var brand: String = "") {
    open fun drive() {
        println("Driving")
    }
     abstract fun honk()
    // or default implementation:
    // fun honk() = "Honk!"
}

class Sedan(override var brand: String = "BRAND", override val a: Int) : Vehicle(), Drivable {

    override fun drive() {
        super<Drivable>.drive()
    }

    override fun honk() {
        println("Honk!")
    }
}

fun main() {
    val sedan = Sedan("volvo", 33)
    sedan.drive()
    sedan.honk()
}
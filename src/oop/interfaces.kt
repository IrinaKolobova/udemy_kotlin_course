package oop

interface Drivable {
    val a: Int
    fun drive() {
        println("Driving (interface)")
    }
}

class Bicycle : Drivable {
    override val a: Int
        get() = 42
    override fun drive() {
        println("Driving bicycle")
    }

    fun b() = 1
}

class Boat : Drivable {
    override val a = 41
    override fun drive() {
        println("Driving boat")
    }
}

fun main() {
    val drivable: Drivable = Bicycle()
    drivable.drive()

}
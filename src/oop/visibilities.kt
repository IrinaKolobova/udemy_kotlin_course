package oop

// private - same as in Java
// protected - same as in Java
// internal - visible inside the same module
// public - same as in Java (default)

private val i = 42

fun a() = 17

open class Car(val brand: String, private val model: String) {
    internal fun tellMeYourModel() = model
}

fun main() {
    val car = Car("BRAND", "MODEL")
    car.brand
    car.tellMeYourModel()
    println(i)
    println(a())
}
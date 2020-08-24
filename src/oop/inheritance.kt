package oop

//Minimal example
open class Base // in Kotlin classes are final by default, we need to declare class as an open class to inherit it

class Child : Base()

open class Shape1(val name: String) {

    open fun area() = 0.0
}

class Circle1(name: String, val radius: Double) : Shape1(name) {

    override fun area() = Math.PI * Math.pow(radius, 2.0)
}

fun main() {
    val smallCircle = Circle1("Small circle", 2.0)

    println(smallCircle.name)
    println(smallCircle.radius)
    println(smallCircle.area())
}
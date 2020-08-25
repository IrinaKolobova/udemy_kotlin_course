package oop

import java.awt.event.*
import oop.House.Companion.getNormalHouse as createHouse


object CountryFactory {

    val a = 4
    fun createCountry() = Country("Australia")
}

object  DefaultListener : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        println("Mouse was clicked")
    }
}

fun main() {
    CountryFactory.a
    CountryFactory.createCountry()

    createHouse()
}
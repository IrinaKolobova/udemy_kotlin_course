package oop

import java.util.*

val list: List<Int> = listOf(1, 2, 3)

class Timeline<E> {

    val date2Data : MutableMap<Date, E> = mutableMapOf()

    fun add(element: E) {
        date2Data.put(Date(), element)
    }

    fun getLatest(): E {
        return date2Data.values.last()
    }
}

fun main() {

    val timeline: Timeline<Int> = Timeline()
    timeline.add(2)
    timeline.getLatest()
}
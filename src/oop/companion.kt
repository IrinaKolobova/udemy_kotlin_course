package oop

interface HouseFactory {
    fun createHouse(): House
}
class House(val numberOfRooms: Int, val price: Double) {

    // companion object Factory {/*...*/}
    companion object : HouseFactory {
        val HOUSES_FOR_SALE = 10
        fun getNormalHouse() = House(6, 199_999.0)
        fun getLuxuryHouse() = House(30, 7_000_000.0)

        override fun createHouse() = getNormalHouse()
    }
}

fun main() {
    val numOfHouses = House.Companion.HOUSES_FOR_SALE
    val normalHouse = House.getNormalHouse()

    println(normalHouse)
    println(House.HOUSES_FOR_SALE)
}
package oop

// adding extension functions:

fun Bicycle.replaceWheel() {
    println("Replacing wheel...")
}

fun Boat.startEngine(): Boolean {
    println("Starting engine...")
    return true
}
fun main() {
    val vehicle: Drivable = Bicycle()

    vehicle.drive()

    // instanceOf <-> is
    if(vehicle is Bicycle) {
        vehicle.replaceWheel()
    } else if (vehicle is Boat) {
        vehicle.startEngine()
    }

    if (vehicle is Boat && vehicle.startEngine()) {
        // ...
    }

    if (vehicle !is Boat || vehicle.startEngine()) {
        // ...
    }

    if (vehicle !is Bicycle) {
        return
    }

    vehicle.replaceWheel()
}
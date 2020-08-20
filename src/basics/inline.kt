package basics

inline fun modifyString(str: String, operation: (String) -> String) : String {
    return operation(str)
}

fun main() {
    modifyString("Kotlin is amazing") { it.toUpperCase() }
}
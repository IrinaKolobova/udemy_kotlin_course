package basics

fun main(args: Array<String>) {

    val list = (1..1000).toList()

    val first10 = list.take(10) // return first 10 elements of the list
    val withoutFirst900 = list.drop(900)

    println(first10)
    println(withoutFirst900)

    println()

    val newList = generateSequence(0) {
        println("Calculating ${it+10}")
        it + 10
    }

    val newFirst10 = newList.take(10).toList()
    val first20 = newList.take(20).toList()

    println(newFirst10)
    println(first20)
}



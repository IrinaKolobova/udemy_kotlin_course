package basics

fun main() {
    val list = listOf("Hi", "there", "Kotlin", "fans")
    val containsT = listOf(false, true, true, false)

    // Pair<String, Boolean>
    //val zipped: List<Pair<String, Boolean>> = list.zip(containsT)
    val zipped = list.zip(containsT)

    val mapping = list.zip(list.map { it.contains("t") })

    println(zipped)
    println(mapping)
    println()

    val data = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )

    println(data)
    println()

    //    Find the average age of users (use only valid ages for the calculation!)
    val averageAge = data.flatMap { it.value }
        .filter { it >= 0 }
           //.filter { it => 0 }
        .average()
    println(averageAge)
    println()

    //    Extract the names of input files that contain faulty data
    val names = data.filter { it.value.any {it < 0} }
        .map{it.key}

    println(names)
    println()

    //    Count the total number of faulty entries across all input files
    val faultNumbers = data.flatMap { it.value }
        .filter { it < 0 }
        .count()

    println(faultNumbers)
    println()

}
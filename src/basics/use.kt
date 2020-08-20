package basics

import java.io.FileReader

fun main() {

    FileReader("mayexist.txt").use {
        val str = it.readText()
        println(str)
        // it.close() - "use" adds automatically
    }
}
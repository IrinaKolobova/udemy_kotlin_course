package basics

import java.io.File

fun main() {
    // Scoping
    /*File("example.txt").bufferedReader().let { reader ->
        if (reader.ready()) {
            println(reader.readLine())
        }
    }*/
    //reader should not be visible
    File("example.txt").bufferedReader().let {
        if (it.ready()) {
            println(it.readLine())
        }
    }

    // Working with nullables
    val str: String? = "Kotlin for Android"

    // messy
    /*if(str!!.isNotEmpty()) {
        str?.toLowerCase()
    }*/

    // neat let operator
    // if str is null "let" will not execute code inside it's block
    str?.let {
        if (str.isNotEmpty()) {
            str.toLowerCase()
        }
    }
}
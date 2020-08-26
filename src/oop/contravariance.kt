package oop

class Source<out T>(val t: T) {

    fun produceT(): T {
        return t
    }
 }

class Sink<in T> {

    fun consumeT(t: T) {
        // ...
    }
}

fun main() {
    val strSource: Source<String> = Source("Producer")
    val anySource: Source<Any> = strSource // out -> covariance
    anySource.produceT()

    val anySink: Sink<Any> = Sink()
    val strSink: Sink<String> = anySink // in -> contravariance
    strSink.consumeT("Consumer")

    // Invariance = neither covariant nor contravariant <? super E>
}
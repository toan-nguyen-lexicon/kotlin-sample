package com.example.demo.function

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    launch {
        delay(500L)
        println("Its me")
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}

package com.example.demo.function

fun main(args: Array<String>) {
    val tt = Test()
    val t = {s: String -> s + "haha"}
    val s = "toan"
    val a = x(s, t)
    val x = tt.getX()
    val b = x(s, x)
    println(a)
    println(b)
}

fun x(s: String, f: (String) -> String): String {
    return f(s)
}

fun abc(i: String): String {
    return i + "test"
}

class Test {
    fun getX(): (String) -> String {
        return { s: String -> s + "hihi" }
    }
}

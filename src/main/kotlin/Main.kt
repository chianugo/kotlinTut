package com.chianugo
import java.util.*
fun getFortuneCookie():String? {
    val fortunes = listOf("You will have a great day!", "Things will go well for you today.", "Today is a good day for exercising restraint.", "Treasure your friends because they are your greatest fortune.")
    print("Enter your age:")
    val age:Int? = readlnOrNull()?.toIntOrNull()
    if (age == null) {
        return "null"
    }
    return fortunes[age % fortunes.size]
}
fun main(args: Array<String>) {
    println("Your fortune is: ${getFortuneCookie()}")

}
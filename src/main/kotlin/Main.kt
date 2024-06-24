package com.chianugo
import java.util.*
fun dayOfWeek() {
    println("What day is it today?")
    print("Today is ")
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("I don't know what today is")
    }
}
fun main(args: Array<String>) {
    dayOfWeek()

}
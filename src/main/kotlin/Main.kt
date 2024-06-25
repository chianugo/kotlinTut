package com.chianugo
import java.util.*
fun main(args: Array<String>) {
//    println("Hello")
//    feedTheFish()
//    getFortuneCookie()
//    println(fitMoreFish(10.0, currentFish = listOf(1,2,3,4,5), 5, true ))
    println(fitMoreFish(10.0, listOf(3,3,3)))
    println(fitMoreFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(fitMoreFish(9.0, listOf(1,1,3), 3))
    println(fitMoreFish(10.0, listOf(), 7, true))
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {

    return when (day) {
        "Monday" ->"flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "red worms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }

}

fun getFortuneCookie():String {
    val fortunes = listOf("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")
    val fortune:String = fortunes[getBirthday()?.rem(fortunes.size) ?: 0]
    return fortune
}

fun getBirthday(): Int? {
    println("What day of the year is your birthday? (0-366)")
    val birthday = readlnOrNull()?.toIntOrNull()
    return birthday
}

fun fitMoreFish(tankSize:Double , currentFish:List<Int>, fishSize:Int = 2, hasDecorations:Boolean = true):Boolean {

    var totalLengthOfFish: Int = 0
    for (element in currentFish) {
        totalLengthOfFish += element
    }
    var hasDecorations = hasDecorations
    var tankSize = tankSize
    if (hasDecorations) {
        tankSize = tankSize * 0.8
    }
    return (tankSize - totalLengthOfFish - fishSize) >= 0

}
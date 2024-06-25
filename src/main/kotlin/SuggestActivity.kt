package com.chianugo

fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy", temperature = 2))
    println(whatShouldIDoToday(readln(), "rainy"))

}

fun whatShouldIDoToday(mood:String, weather:String = "sunny", temperature:Int = 24):String{
    return when {
        mood == "happy" && weather == "sunny"-> "dance"
        mood == "sad" && weather == "rainy" -> "stay in bed and read"
        temperature > 30 -> "go for a swim"
        mood == "happy" && temperature < 5 -> "go ice skating "
        else -> "Stay home and watch a movie"
    }
}
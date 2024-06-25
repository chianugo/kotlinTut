package com.chianugo.Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.height = 80

    println("Length: ${myAquarium.length} cm " + "Width: ${myAquarium.width} cm " + "Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} liters")
}
package com.chianugo.Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.height = 80

    println("Length: ${myAquarium.length} " + "Width: ${myAquarium.width} " + "Height: ${myAquarium.height}")
}
package com.chianugo.SimpleSpice

class SimpleSpice {
    var name:String = "curry"
    var spiciness:String = "mild"
    var heat:Int = 0
        get() = when(spiciness) {
            "mild" -> 5
            else -> 0
        }
}
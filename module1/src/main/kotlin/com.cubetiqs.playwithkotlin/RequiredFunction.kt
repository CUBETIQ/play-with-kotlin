package com.cubetiqs.playwithkotlin

// Required current and sumWith value must be greater than ZERO
fun Double.sumIf(sumWith: Double, condition: (Double) -> Boolean): Double {
    require(this > 0) {
        "You must input value greater than ZERO!"
    }
    require(sumWith > 0) {
        "You must input value greater than ZERO!"
    }

    if (condition(this)) {
        return this.plus(sumWith)
    }

    return this
}

fun main() {
    val c = 101.0
    val w = 1.0
    val r = c.sumIf(w) {
        it > 100
    }

    println("Result => $r")
}
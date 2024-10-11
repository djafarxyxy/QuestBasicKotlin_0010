package com.example.noactifity

import org.jetbrains.annotations.NotNull

fun nullSafety() {
    // neverNull has String Type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    // neverNull = null

    // Nullable has nullable String type
    var nullable: String? = "you can keep a null here"
    // this is OK
    nullable = null


    // Check for null in conditions
    if (neverNull == null) {
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    // Safe call operator
    println(neverNull.length) //18
    println(nullable?.length) // null

    //notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) //18
}

fun main() {
    nullSafety()
}
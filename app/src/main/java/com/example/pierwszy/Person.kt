package com.example.pierwszy

import java.util.*

class Person(
    var dateOfBirth: Long
) : IPerson {

    override fun calculateAge(): Long {
        return Date().time.minus(dateOfBirth)
    }

    override fun getName(): String {
        return "Ziomal"
    }
}
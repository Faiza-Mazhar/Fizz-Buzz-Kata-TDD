package com.example.fizzbuzzkata

class FizzBuzz {

    private val fizz = "Fizz"
    private val buzz = "Buzz"

    fun fizzBuzz(number: Int) : String {
        return when {
            (number % 15 == 0) -> fizz + buzz
            (number % 5 == 0) -> buzz
            (number % 3 == 0) -> fizz
            else -> number.toString()
        }
    }
}
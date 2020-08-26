package com.example.fizzbuzzkata

import org.junit.Assert
import org.junit.Test


class FizzBuzzTest {
    private val fizzBuzz = FizzBuzz()

    @Test
    fun `returns given number as a string`() {
        val number = 1
        val expectedString = number.toString()
        Assert.assertEquals(expectedString, fizzBuzz.fizzBuzz(number))
    }

    @Test
    fun `if number is divisible by 3, return fizz` () {
        val number = 3
        val expectedString = "Fizz"
        Assert.assertEquals(expectedString, fizzBuzz.fizzBuzz(number))
    }

    @Test
    fun `if number is divisible by 5, return fizz` () {
        val number = 5
        val expectedString = "Buzz"
        Assert.assertEquals(expectedString, fizzBuzz.fizzBuzz(number))
    }

    @Test
    fun `if number is divisible of 3 and 5, return fizzbuzz`() {
        val number = 45
        val expectedString = "FizzBuzz"
        Assert.assertEquals(expectedString, fizzBuzz.fizzBuzz(number))
    }

}
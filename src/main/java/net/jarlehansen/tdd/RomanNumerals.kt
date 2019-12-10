package net.jarlehansen.tdd

import java.util.Arrays.asList

private val ones = asList("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
private val tens = asList("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
private val hundreds = asList("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
private val thousands = asList("", "M", "MM", "MMM")

class RomanNumerals {
    fun convert(number: Int): String = ""

    private fun toDigits(number: Int): List<Int> = "$number"
        .padStart(4, '0')
        .map { Integer.parseInt("$it") }
}

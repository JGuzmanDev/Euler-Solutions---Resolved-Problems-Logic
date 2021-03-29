/*
Multiples of 3 and 5

https://projecteuler.net/problem=1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

Resolved by JGuzmanDev
Date: 29/03/2021
*/

fun main(args: Array<String>) {
    (1..999).forEach { num ->
        printMultiples3Or5(num)
    }
}

private fun printMultiples3Or5(num: Int) {
    when {
        num % 3 == 0 -> println(num)
        num % 5 == 0 -> println(num)
    }
}
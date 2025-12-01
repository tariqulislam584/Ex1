{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 fun main() \{\
    // 1. Find the first 50 prime numbers and store them in a mutable list\
    val primeList = findFirstNPrimes(50)\
\
    // 2. Print the list of prime numbers\
    println("--- First 50 Prime Numbers ---")\
    println(primeList)\
    println("List size: $\{primeList.size\}")\
\
    println("\\n" + "-".repeat(40) + "\\n")\
\
    // 3. Create a list of the first 50 even numbers (starting from 2)\
    val evenList = (1..50).map \{ it * 2 \}\
\
    // 4. Add the even numbers to the prime list\
    primeList.addAll(evenList)\
\
    // 5. Print the combined list\
    println("--- Combined List (Primes + First 50 Even Numbers) ---")\
    println(primeList)\
    println("Combined list size: $\{primeList.size\}")\
\}\
\
/**\
 * Checks if a number is prime.\
 * A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers.\
 */\
fun isPrime(number: Int): Boolean \{\
    if (number <= 1) return false\
\
    var i = 2\
    while (i * i <= number) \{\
        if (number % i == 0) \{\
            return false\
        \}\
        i++\
    \}\
    return true\
\}\
\
/**\
 * Finds the first N prime numbers and returns them in a list.\
 */\
fun findFirstNPrimes(n: Int): MutableList<Int> \{\
    val primes = mutableListOf<Int>()\
    var number = 2\
\
    while (primes.size < n) \{\
        if (isPrime(number)) \{\
            primes.add(number)\
        \}\
        number++\
    \}\
    return primes\
\}\
}
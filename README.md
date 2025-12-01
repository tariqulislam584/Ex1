# Kotlin List Manipulation: Primes and Even Numbers

This Kotlin program is designed to demonstrate basic list creation and manipulation.

## Program Functionality

1.  **Prime Number Generation**: Finds and stores the first 50 prime numbers (starting from 2) in a `MutableList<Int>`.
2.  **Even Number Generation**: Creates a list containing the first 50 positive even numbers (2, 4, 6, ..., 100).
3.  **List Combination**: Appends the list of even numbers to the end of the prime number list.
4.  **Output**: Prints both the initial prime list and the final combined list, along with their sizes, to the console.

### Key Implementation Details

* The `findFirstNPrimes` function iteratively checks numbers using an efficient `isPrime` helper function.
* The `isPrime` function checks for divisibility only up to the square root of the number for optimized performance.
* The even numbers are generated concisely using Kotlin's range and `map` function: `(1..50).map { it * 2 }`.

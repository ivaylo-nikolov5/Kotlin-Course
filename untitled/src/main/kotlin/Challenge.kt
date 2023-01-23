fun main() {
    var numbersCount = 0

    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }

        numbersCount++
        println(i)
    }

    println("The total count of the numbers is: $numbersCount")
}
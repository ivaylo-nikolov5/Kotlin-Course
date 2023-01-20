fun main() {
    var x = 5
    val y = 3

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y

    result += 2
    println("result = $result")

    result -= 2
    println("result = $result")

    result *= 2
    println("result = $result")

    result /= 2
    println("result = $result")

    result %= 2
    println("result = $result")

    println("3 + 3 * 4 = ${(3 + 3) * 4}")
    x = 0

    println("x = ${x++}")
    println("x = ${++x}")

    println("x = ${x--}")
    println("x = ${--x}")

    val myNumber = 120

    if (myNumber >= 120) {
        println("Greater or equal to 120")
    }else if (myNumber > 90){
        println("Greater than 90")
    }else {
      println("All the conditions failed")
    }

}
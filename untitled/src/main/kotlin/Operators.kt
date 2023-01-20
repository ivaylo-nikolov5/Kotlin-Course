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

    val myNumber = 150

    if (myNumber <= 120) {
        println("Less or equal to 120")
    }else if (myNumber != 150){
        println("Not equal to 150")
    }else {
      println("All the conditions failed")
    }

    val isActive = true
    if (!isActive) {
        println("The user is active")
    } else {
        println("The user is not active")
    }

    val isPlaying = true
    val score = 100

    if (isPlaying && score == 100) {
        println("The player has full score points")
    } else if (isPlaying){
        println("The player has lower score than 100")
    } else {
        println("The player is not currently playing")
    }
}
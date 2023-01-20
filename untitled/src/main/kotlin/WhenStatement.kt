fun main() {
    val alarm = 8
    val text = when {
        alarm == 8 || alarm == 7-> "The time is $alarm"
        alarm <= 10 -> "The time is in the range from 1 to 10"
        else -> "Error"

    }

    println(text)
}
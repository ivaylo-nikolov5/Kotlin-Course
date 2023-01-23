fun main() {
    sum(5, 6, 7, 10, 5, 2, 1, 3, 4)
}

fun sum(vararg numbers: Int) {
    numbers.forEach { println(it) }
}

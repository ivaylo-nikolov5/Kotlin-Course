fun main() {
    val max = getMax(4, 7, 12)
    println(max)

}

fun getMax(a: Int, b: Int) = if (a > b) a else b
fun getMax(a: Double, b: Double) = if (a > b) a else b
fun getMax(a: Int, b: Int, c: Int): Int {
    if (a > b && a > c) {
        return a
    } else if (b > a && b > c) {
        return b
    } else {
        return c
    }
}



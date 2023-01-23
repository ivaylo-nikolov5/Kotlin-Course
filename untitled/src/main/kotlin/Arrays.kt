fun main() {
    val names = arrayOf("Ivaylo", "Alex", "Jordan")
    val mixedElements = arrayOf(1, 2, 3, 4, 5, 6, "Hi", "c")
    names[0] = "Andrew"
    println(names[0])
    println(names.size)

    for (i in mixedElements) {
        if (i is Int) {
            println(i)
        }
    }
}
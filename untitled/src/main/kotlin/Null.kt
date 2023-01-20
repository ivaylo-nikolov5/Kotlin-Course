fun main() {
    var text: String? = null

    text = "This variable is not null"
    var text2 = ""

    if (text != null) {
        text2 = text
    } else {
        text2 = "The variable is null"
    }
    println(text2)
}
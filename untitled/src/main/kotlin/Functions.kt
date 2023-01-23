fun main() {
    sendMessage("Ivaylo")
}

fun sendMessage(name: String = "User", message: String = sendText()) {
    println("Name = $name and message = $message")
}

fun sendText() = "Some text"



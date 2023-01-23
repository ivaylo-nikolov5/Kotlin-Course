fun main() {
    sayHello("Ivaylo", 17)
    val hasInternetConnection = false
    if (hasInternetConnection) {
        getData("Data Example")
    } else {
        showMessage()
    }
}

fun sayHello(name: String, age: Short) {
    var number = age
    println("Hello, $name! Your age is $age.")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("There is no internet connection!")
}
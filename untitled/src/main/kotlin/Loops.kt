fun main() {
//    for loop

//    for (i in 1..10) {
//        println("i = $i")
//    }
//
//    for (i in 1 until 10) {
//        println(i)
//    }
//
//    for (i in 10 downTo  1) {
//        println(i)
//    }
//
//    for (i in 1 until 10 step 2) {
//        println(i)
//    }

//    for (i in 1..10) {
//        println(i)
//    }

//    while loop


//    while (number < 10) {
//        number++
//        if (number == 7) {
//            break
//        }
//        println(number)
//    }

//    for (i in 1..10) {
//        if (i == 7) {
//            break
//        }
//        println(i)
//    }

//    do {
//        println(number)
//    } while (number < 10)

    var number = 0

    outer@ while (number < 5) {
        number++
        println(number)

        var i = 0

        while (i < 5) {
            if (i == 0) {
                break@outer
            }
            i++
            println("***$i")
        }
    }
}
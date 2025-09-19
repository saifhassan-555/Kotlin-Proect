fun main() {
    println("Enter value of temperature:")
    val value = readln().toDouble()

    println("Convert to (C/F)?")
    val scale = readln().uppercase()

    val result = if (scale == "C") {
       (value - 32) * 5 / 9 // Fahrenheit  to Celsius
    }

    else if (scale == "F") {
      (value * 9 / 5) + 32   // Celsius to Fahrenheit
    }
    else {
        println("Invalid Scale")
    }
    println("Converted temperature: $result ")
}


//fun main() {
//    println("Enter value of temperature:")
//    val value = readln().toDouble()
//
//    println("Convert to (C/F)?")
//    val scale = readln().uppercase()
//
//    if (scale == "C") {
//        val result_1 =   (value - 32) * 5 / 9 // Fahrenheit  to Celsius
//        println("Converted temperature: $result_1 ")
//    }
//
//    else if (scale == "F") {
//        val result_2 = (value * 9 / 5) + 32   // Celsius to Fahrenheit
//        println("Converted temperature: $result_2 ")
//    }
//    else {
//        println("Invalid Scale")
//    }
//}
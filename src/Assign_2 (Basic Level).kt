 //vowels Program
fun main() {
    print("Enter any character: ")
    val vowels = readLine()!!.toString()[0]

    if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u')
    {
        println("You Entered a Vowels")
    }
    else if (vowels == 'A' || vowels == 'E' || vowels == 'I' || vowels == 'O' || vowels == 'U')
        {
            println("You Entered a Vowels")
    }
    else{
        println("You Entered a Consonent")
    }
}


// Even Odd Program
//fun main (){
//    println("Enter Number")
//    var num = readLine()!!.toInt()
//    if (num % 2 == 0 )
//    {
//        println("$num is Even")
//    }
//    else if (num % 2 == 1 ){
//        println("$num is Odd")
//    }
//    else {
//        println("Invalid Input")
//    }
//}

//Positive & Negative Program
//fun main (){
//    println("Enter Number")
//    var num = readLine()!!.toInt()
//    if (num > 0 )
//    {
//        println("$num is Positive")
//    }
//    else if (num < 0 ){
//        println("$num is Negative")
//    }
//    else if (num == 0 ){
//        println("$num is Zero")
//    }
//    else {
//        println("Invalid Input")
//    }
//}

//Age Program
//fun main (){
//    println("Enter Your Age")
//    var age = readLine()!!.toInt()
//    if (age <= 12 )
//    {
//        println("$age You are Child")
//    }
//    else if (age >= 13 && age < 20 ){
//        println("$age You are Teenager")
//    }
//    else if (age >= 20 && age < 60 ){
//        println("$age You are Adult")
//    }
//    else {
//        println("You are Senior Citizen")
//    }
//}

// Result Program
//fun main (){
//    println("Enter Your Marks")
//    var marks = readLine()!!.toInt()
//    if (marks in 0..100) {
//        if (marks >= 60) {
//            println("$marks You are Pass")
//        }
//    else {
//        println("$marks You are Fail")
//    }
//    }
//    else {
//        println("Invalid Input! Please Enter Marks Between 0 to 100")
//    }
//}

 //Max Two Number Program
//fun main (){
//    println("Enter Number")
//    val num1 = readLine()!!.toInt()
//    println("Enter Another Number")
//    val num2 = readLine()!!.toInt()
//    if (num1 > num2)
//    {
//        println("$num1 is Larger")
//    }
//    else if (num2 > num1)
//    {
//        println("$num2 is Larger")
//    }
//    else{
//        println("Equal Number")
//    }
//}

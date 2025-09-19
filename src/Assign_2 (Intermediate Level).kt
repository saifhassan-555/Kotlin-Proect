
//Question 7
// Result Program
//fun main() {
//    println("Enter your marks: ")
//    val marks = readLine()!!.toInt()
//    if (marks in 0..100) {   // used for validation 0 to 100
//        if (marks >= 90 && marks <= 100) {
//            println("Grade is A")
//        } else if (marks >= 80 && marks < 90) {
//            println("Grade is B")
//        } else if (marks >= 70 && marks < 80) {
//            println("Grade is C")
//        } else if (marks >= 60 && marks < 70) {
//            println("Grade is D")
//        } else if (marks < 60) {
//            println("Fail")
//        }
//    }
//    else {
//        println("Invalid Number! please Enter Marks Between 0 to 100")
//    }
//}

//Question 8
// Week Days Program
//fun main() {
//    println("Enter Day Number: ")
//    val day = readLine()!!.toInt()
//    if (day == 1) {
//        println("Monday")
//    } else if (day == 2) {
//        println("Tuesday")
//    } else if (day == 3) {
//        println("Wednesday")
//    } else if (day == 4) {
//        println("Thursday")
//    } else if (day == 5) {
//        println("Friday")
//    } else if (day == 6) {
//        println("Saturday")
//    }else if (day == 7) {
//        println("Sunday")
//    }else {
//        println("Invalid Number! please Enter Marks Between 1 to 7")
//    }
//}

//Question 9
//Calculator Program
//fun main() {
//    print("Enter first number: ")
//    val num1 = readLine()!!.toDouble()
//    print("Enter second number: ")
//    val num2 = readLine()!!.toDouble()
//    print("Enter operator (+, -, *, /): ")
//    val operator = readLine()!!
//
//    val result = if (operator == "+") {
//        num1 + num2
//
//    } else if (operator == "-") {
//       num1 - num2
//
//    } else if (operator == "*") {
//       num1 * num2
//
//    } else if (operator == "/") {
//        if (num2 != 0.0) {
//          num1 / num2
//        } else {
//            println("Error: Division by zero")
//        }
//    } else {
//        println("Invalid Operator")
//    }
//    println("$result")
//}

//Question 10
//Discount Calculator
//fun main() {
//    println("Enter Purchase Amount")
//    val amount = readLine()!!.toDouble()
//    var finalAmount = amount
//
//    if (amount < 100) {
//        println("No Discount = $amount")
//    }
//    else if (amount >= 100 && amount < 500) {
//        finalAmount = amount - (amount * 0.10)
//        println("10% Discount = $finalAmount")
//    }
//    else if (amount >= 500 && amount < 1000) {
//        finalAmount = amount - (amount * 0.20)
//        println("20% Discount = $finalAmount")
//    }
//    else if (amount >= 1000) {
//        finalAmount = amount - (amount * 0.30)
//        println("30% Discount = $finalAmount")
//    }
//    else {
//        println("Please Enter Value greater than 0")
//    }
//}

//Question 11
//BMI Calculator
//fun main (){
//    println("Enter Your Weight")
//    val weight = readLine()!!.toFloat()
//    println("Enter Your Height")
//    val height = readLine()!!.toFloat()
//    val bmi: Float = weight / (height * height)
//    println("Your BMI is: $bmi")
//    if (bmi < 18.5)
//    {
//        println("You are Under Weight")
//    }
//    else if (bmi >= 18.5 && bmi < 25)
//    {
//        println("Your BMI is Normal")
//    }
//    else if (bmi >= 25 && bmi < 30)
//    {
//        println("Your BMI is Over weight")
//    }
//    else {
//        println("Obese")
//    }
//}


//Question 12
//Max Three Number Program
//fun main () {
//    println("Enter First Number")
//    val num1 = readLine()!!.toInt()
//    println("Enter Second Number")
//    val num2 = readLine()!!.toInt()
//    println("Enter Third Number")
//    val num3 = readLine()!!.toInt()
//    if (num1 >= num2) {
//        if (num1 >= num3) {
//            println("$num1 is Larger")
//        } else {
//            println("$num3 is largest")
//        }
//    } else {
//        if (num2 >= num3) {
//            println("$num2 is Largest")
//        } else {
//            println("$num3 is largest")
//        }
//    }
//}


//Question 15
// Tax Calculator
//fun main (){
//    println("Enter your annual Income")
//    val income = readLine()!!.toInt()
//    var tax = income
//    if (income <= 10000)
//    {
//       println("No Tax is Applied")
//    }
//    else if (income >= 10001 && income < 40000)
//    {
//        tax = (income * 0.10).toInt()
//        println("Tax = $tax")
//    }
//    else if (income >= 40001 && income < 85000)
//    {
//         tax = (income * 0.20).toInt()
//         println("Tax = $tax")
//    }
//    else if (income > 85000)
//    {
//       tax = (income * 0.30).toInt()
//        println("Tax = $tax")
//    }
//}
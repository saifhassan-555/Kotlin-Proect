fun main() {
    var price = 100
    println("Enter the age of Person")
    val age = readln().toInt()
    println("Do you have student ID")
    val studentid = readln().toString()
    if (age < 12) {
        price = price - 50
        println("category is : Child & price is $price")
    }
       else if (age>=12 && age<=25)
        {
            if (studentid == "yes")
            {
                price = price - 25
                println("category is : Student & price is $price")
            }
    }
  else if (age > 65){
        price = price - 30
        println("category is : Senior Citizen & price is $price")
    }
    else{
        println("category is : Adult & price is $price")
    }
}

//fun main() {
//    val baseprice = 100.0
//    println("Enter Age of Person : ")
//    val age = readln().toInt()
//    println("you have valid ID ?")
//    val personID = readln().lowercase()
//    val finalprice: Double
//
//    if (age < 12) {
//        finalprice=baseprice * 0.5
//        println("category is child")
//    }
//    else{
//        if (age>=12 && age<=25)
//        {
//            if (personID=="yes")
//            {
//                finalprice = baseprice * 0.75
//                println("Category : Student")
//            }
//            else
//            {
//                finalprice = baseprice
//                println("Category : Regular student")
//            }
//        }
//        else {
//            if (age>65) {
//                finalprice = baseprice * 0.7
//                println("Category : Senior")
//            }
//            else {
//                finalprice = baseprice
//                println("Category : Adults")
//            }
//        }
//    }
//    println("Ticket Price is $$finalprice")
//}
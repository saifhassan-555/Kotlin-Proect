
fun main (){
    println("Enter year")
    var year = readln().toInt()
    if ((year % 4 == 0 )|| (year % 400 == 0  && year % 100!= 0))
    {
        println("$year is leap")
    }
    else {
        println("$year is not leap")
    }
}


//
//fun main (){
//    println("Enter year")
//    var year = readln().toInt()
//    if (year % 4 == 0)
//    {
//        if (year % 100 == 0)
//        {
//            if (year % 400 == 0)
//            {
//                println("$year is leap")
//            }
//            else {
//                println("$year is not leap")
//            }
//        }
//        else{
//            println("$year is leap")
//        }
//    }
//    else {
//        println("$year is not leap")
//    }
//}



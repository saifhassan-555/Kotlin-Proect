//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//    print("Enter your marks: ")
//    val marks = readln().toInt() // readLine used with !! (null assertion operator)
//
//    if (marks >= 90) {
//        println("Grade is A")
//    }
//    if (marks >= 80 && marks <90) {
//        println("Grade is B")
//    }
//    if (marks >= 70  && marks <80) {
//        println("Grade is C")
//    }
//    if (marks >= 60  && marks <70) {
//        println("Grade is D")
//    }
//    else{
//        println("Fail")
//    }
//}

//    val num = 70
//    if (num % 2 == 0) {
//        println("value is even")
//    }
////    if (num % 2 == 0) {
//    else{
//        println("value is odd")
//    }
//}
//    var r:Int?=3
//    println(r)
//    var result = r!!.times(2) // !! not assertion operator
//    println(result)
//    println("My name is \n Saif")
//    var radius : Double? = null
//    var sard : Double = 2.0
//    println(radius)


//fun main (){
//    println("Enter a number")  // Block Expression
//    val number = readLine()!!.toInt()
//    val result: String = if (number > 0) {
//        println("Positive Number")
//        "Positive"    // return Statement
//    }
//    else if (number < 0)
//    {
//      println("Negative Number")
//        "Negative"
//    }else {
//        println("zero")
//        "zero"
//    }
//}

//fun main(){
//    println("Enter number")
//    val a = readLine()!!.toInt()
//    if(a < 0)
//    {
//        return  // terminate the entire program
//        print(a)
//    }
//    print(a)
//}


//fun main(){
//    println("Enter Day Number")
//    val dayNumber = readLine()!!.toInt()
//    val dayName = when(dayNumber) {
//        1-> "Monday"
//        2-> "Tuesday"
//        3-> "Wednesday"
//        4-> "Thursday"
//        5-> "Friday"
//        6-> "Saturday"
//        7-> "Sunday"
//        else -> "Invalid Day"
//    }
//    println(dayName)
//}

//fun main(){
//    println("Enter First number")
//    val num1 = readln().toInt()
//    println("Enter Second number")
//    val num2 = readln().toInt()
//    print("Enter operator (+, -, *, /): ")
//    val operator = readln()
//    val result = when (operator){
//        "+" -> num1 + num2
//        "-" -> num1 - num2
//        "*" -> num1 * num2
//        "/" -> {if (num2!=0){num1 / num2} else "Error Division by Zero" }
//        else -> "Invalid Operator"
//    }
//    println("Result: $result")
//}

//fun main(){
//    val empty = emptyList<Int>()
//    empty[0]
//}

//fun main() {
//    val fruits = listOf("apple", "banana", "mango")
//    val result = fruits.size
//    println(result)
//}
//    if ("pineapple" in fruits){
//        println("available")
//    }
//        else{
//            println("not available")
//        }
//}
//fun main() {
//    val number = listOf(1,1,1,1,2,3,4,5)
//    val result = number.count{it > 3}
//    println(result)
//}

// mutable List Index / positioning
//fun main() {
//    val fruits = mutableListOf("apple", "banana")
//    val result = fruits.add("peach")
//    fruits[0] = "pineapple"
//    println(fruits)
//    fruits.add(0,"grape")
//    println(fruits)
//    fruits.addAll(1,listOf("mango, kiwi"))
//    println(fruits)
//}



// mutable List Add function
//fun main() {
//    val mutableColors = mutableSetOf("red", "green")
//    mutableColors.add("blue")
//    mutableColors.addAll(setOf("pink", "yellow"))
//    println(mutableColors)
//}


// Set Operations
//fun main(){
//    val primaryColors = setOf("red", "blue", "yellow")
//    val warmColors = setOf("red", "orange", "yellow")
//    val symmetric = (primaryColors-warmColors) union (warmColors-primaryColors)
//    println(symmetric)
//}

//fun main(){
//    val evennumber = setOf(2,4,6,8)
//    val oddnumber = setOf(1,3,5,7)
//    val symmetric = (evennumber - oddnumber) union (oddnumber - evennumber)
//    println(symmetric)
//}


//fun main (){
//    val ktln  = "Kotlin Programming"
//    println (ktln.contains("Programming"))
//    println (ktln.startsWith("Kot"))
//    println (ktln.endsWith("ing"))
//    println(ktln.lastIndexOf("m"))
//}


//fun main (){
//    val config = mapOf(
//        "host" to "localHost",
//        "port" to "8080",
//        "ssl" to "false")
////        val port = config.getOrDefault("port", "3000")
////        val timeout = config.getOrElse("timeout") {"30"}
////        val ssl = config.getValue("ssl")
////        val db = config.containsKey("host")
////        val eb = config.getValue("host")
////          println(db)
////          println(eb)
//    val sb = config.contains("ssl")  // check complete elements
//    println(sb)
//}
//
//fun main (){
//    val productPrices = mapOf(
//        "laptop" to 999.99,
//        "mouse" to 29.99,
//        "keyboard" to 79.99,
//        "monitor" to 299.99
//    )
////    val expensiveItems = productPrices.filterKeys { it.length > 5}
////    val expensiveItem = productPrices.filterValues { it > 100.0}
////        println(expensiveItems)
////        println(expensiveItem)
//    val discountPrices = productPrices.mapValues { (_, price) -> price * 0.9 }
//    println(discountPrices)
//    val upperCase = productPrices.mapKeys { (key, _) -> key.uppercase() }
//    println(upperCase)
//}


//fun main (){
//   val a  = listOf(1,2,3,4)
//    for (i in a) {
//        println(i)
//    }
//}

//fun main (){
//    for (i in 1..10 step 2) {
//        println("Number: $i")
//    }
//}

//fun main (){
//    for (i in 10 downTo 1 step 3) {
//        println("Number: $i")
//    }
//}

//fun main() {
//    val fruits = listOf("Apple", "Banana", "Orange")   // loop in collection
//
////    for (fruit in fruits) {
////        println(fruit)
//        for ((index, fruit) in fruits.withIndex()) {
//            println("$index: $fruit")
//        }
//    }

//fun main() {
//    var count = 1
//
//    while (count <= 5) {
//        println("Count: $count")
//       ++count
//    }
//}

//fun main(){
//    var num = 1
//    val a = ++ num
//    val b = num ++
//    println(a)
//    println(b)
//    println(num)
//}


//fun main () {
//    val j = 2
//    for (i in 1..10) {
//        val mul = j*i
//        println("$j * $i = $mul")
//    }
//}

//fun main (){
//
//    for (table in 2..10){
//
//        println("Table of $table")
//
//        for(i in 1..10) {
//            val mul = table * i
//            println("$table x $i = $mul")
//        }
//    }
//}


//fun main() {
//    val rows = 5
//  for (i in 1..rows) {
//      for (space in 1..(rows-i)){
//          println(" ")
//      }
//    for (j in 1..i ) {
//        print("* ")
//    }
//      println()
//  }
//}



// Array of Matrix
//fun main(){
//    val matrix = arrayOf(
//        intArrayOf(1, 2, 3),
//        intArrayOf(4, 5, 6),
//        intArrayOf(7, 8, 9)
//    )
//    var sum = 0
//    for (i in matrix.indices){
//        for(j in matrix[i].indices) {
//            sum += matrix [i][j]
//        }
//    }
//    println("Total Sum : $sum")
//}


// Sum of Matrix
//fun main(){
//    val matrix = arrayOf(
//        intArrayOf(1, 2, 3),
//        intArrayOf(4, 5, 6),
//        intArrayOf(7, 8, 9)
//    )
//    var totalSum = matrix.sumOf { row -> row.sum() }
//
//    println("Total Sum : $totalSum")
//}
//
//fun calculateArea(length: Int, width: Int) {
//    if (length == 0 || width == 0) {
//        println("Error! values cannot be calculated")
//    } else {
//        val area = length * width
//        println("The area is: $area")
//    }
//}
//
//fun main() {
//    println("Enter length:")
//    val length = readLine()!!.toInt()
//
//    println("Enter width:")
//    val width = readLine()!!.toInt()
//    calculateArea(length, width)
//}

//fun calculateArea(length: Int, width: Int) : Int{
//   return  length * width
//}
//
//fun main() {
//    println("Enter length:")
//    val length = readLine()!!.toInt()
//
//    println("Enter width:")
//    val width = readLine()!!.toInt()
//    if (length <=0 || width <= 0){
//        println("Error! arae cannot br calculated")
//    }
//
//    else {
//   val area =  calculateArea(length, width)
//    println("Area is : $area")
//    }
//    }



//fun main(){
//
//    val person1 = person()  // default constructor
//    println("Enter person 1 name")
//    person1.name = readln().toString()
//    println("Enter person 1 Age")
//    person1.age = readln().toInt()
//    person1.introduce()
//
//    val person2 = person()
//    println("Enter person 2 name")
//    person2.name = readln().toString()
//    println("Enter person 2 Age")
//    person2.age = readln().toInt()
//    person2.introduce()
//
//    val person3 = person()
//    println("Enter person 3 name")
//    person3.name = readln().toString()
//    println("Enter person 3 Age")
//    person3.age = readln().toInt()
//    person3.introduce()
//
//    val person4 = person()
//    println("Enter person 4 name")
//    person4.name = readln().toString()
//    println("Enter person 4 Age")
//    person4.age = readln().toInt()
//    person4.introduce()
//}

//class Person (val name: String) {
//    var age : Int = 0
//    var email : String = ""
//    init {
//        println("The name is Saif Hassan ")
//    }
//
//    constructor(name: String, age: Int) : this (name) {  // secondary constructor
//        this.age = age
//        println(" The person data is $name, Age is: $age")
//    }
//
//    constructor(name: String, age: Int, email: String) : this(name, age) {   // another secondary constructor
//        this.email = email
//        println(" The person data is $name, Age is: $age, Email: $email")
//    }
//}
//fun main () {
//    val person1 = Person("Saif", 25, "saif@451")
////    val person2 = Person("saif", 25)
//}

//class Person (val name: String) {
//    var age: Int = 0
//
//    constructor(name: String, age: Int) : this(name) {
//        this.age = age
//    }
//
//    }
//
//
//fun main(){
//    val person = Person("Saif")
//    println("The name is $person")
//}

//open class Animal (val name: String) {
//    open fun makeSound (){
//        println("$name makes a sound")
//    }
////    fun wagTail() {
////        println("$name is wagging tail")
////    }
//}
//
//class Dog (name: String, val breed: String)  : Animal(name) {
//    override fun makeSound() {
//        super.makeSound()  // to override the parent functionality
//        println("$name barks: Woof!")
//        fun sleep() {
//            println("$name is sleeping")
//        }
//    }
//}
//
//fun main (){
////    val p1 = Animal("animals")
////    p1.makeSound()
//      val p2 = Dog("Lion", "Roar")
//      p2.makeSound()
//}


//abstract class Animal {
//    val name: String = "unknown"
//
//    abstract val species: String
//
//    abstract fun makeSound()
//
//    fun sleep() {
//        println("$name is sleeping")
//    }
//}
//class Dog(override val species: String = "Canine"):Animal(){
//
//    override fun makeSound() {
//        println("$name is written")
//    }
//}

//class SavingAccount (private val balance: Int, private val account: String) { // to string method
//    override fun toString(): String {
//        return "(Account Balance : $balance, Account Number : $account)"
//    }
//}
//
//fun main(){
//    val sa = SavingAccount(1000, "abdh67")
//    println (sa)
//}

//
//data class User(val id: Int, val name: String, val isActive: Boolean)
//fun main() {
//    val user1 = User(1, "John", true)
//    val user2 = User(1, "John", true)
//    val user3 = User(2, "Jane", false)
//
//    println(user1)  // to string automatically generated
//
//    // equal comparison
//    println(user1 == user2)
//    println(user1 == user3)
//
//    // copy with modifications
//    val updateUser = user1.copy(isActive = false)
//    println(updateUser)
//
//    //Destructuring
//    val (id, name, active) = user3
//    println("ID $id, Name: $name, Active: $active")
//}


data class Book(
    val isbn : String,
    val title : String,
    val author : String,
    var isAvailable : Boolean = true
)

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
        println("Added: ${book.title}")
    }

    fun borrowBook(isbn: String): Boolean {
        val book = books.find { it.isbn == isbn && it.isAvailable }
        return if (book != null) {
            book.isAvailable = false
            println("Borrowed: ${book.title}")
            true
        } else {
            println("Book not available")
            false
        }
    }

    fun returnBook(isbn: String): Boolean {
        val book = books.find { it.isbn == isbn && !it.isAvailable }
        return if (book != null) {
            book.isAvailable = true
            println("Returned: ${book.title}")
            true
        } else {
            println("Book not found in borrowed list")
            false
        }
    }

    fun listAvailableBooks() {
        val available = books.filter { it.isAvailable }
        println("Available books:")
        available.forEach { println("${it.title} by ${it.author}") }
    }
}

fun main (){
    val library = Library()

    val book1 = Book("The Honorable", "my self", "Hassan", isAvailable = true)
    val book2 = Book ("Global", "World", "Usama", isAvailable = false)
    val book3 = Book("Hideous", "sorry", "ALi", isAvailable = true)
    val book4 = Book ("Ground", "Please", "Saif", isAvailable = false)

    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)
    library.addBook(book4)

    library.listAvailableBooks()

    println("Borrowing a book")
    library.borrowBook("The Honourable")

    library.listAvailableBooks()

    println("Returning a book")
    library.returnBook("Global")

    library.listAvailableBooks()
    print("Hello World")

}








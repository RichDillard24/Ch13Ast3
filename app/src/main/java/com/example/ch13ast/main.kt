package com.example.ch13ast

fun main () {
    println("===== List EX =====")

    val fruits = listOf("Apples","Banana","berry","Banana")

    println(fruits)
    println("First fruit: ${fruits[0]}")
    println("Third fruit: ${fruits[2]}")

    // Set
    println("===== set EX =====")


    val subjects = setOf("Kotlin","jetpack","Kotlin","Django")
    println(subjects)

    val colors = setOf("Red","Blue","Yellow","Green","Blue")
    println("Colors: $colors")
    println("Size: ${colors.size}")

    // Challenge 1


    val hobbies = setOf("Gaming","Hiking","Caming","Gaming","Gambling")
    println("Hobbies: $hobbies")
    println("Number of unique hobbies is ${hobbies.size}")

    // sets are useful when your looking for a s

    println("===== Map EX =====")

    val student = mapOf(
        "name" to "Richard",
        "school" to "SDGKU",
        "program" to "MDI2"
    )

    println(student)
    println("name: ${student["name"]}")
    println("Program: ${student["program"]}")

    // challenge 2

    val states = mapOf(
        "Washington" to "Seattle",
        "California" to "Sacramento",
        "Colorado" to "Denver",
        "Utah" to "Provo"
    )
    println(states)
    println("The capitol of colorado is: ${states["Colorado"]}")

    println("===== Challenge 3 EX =====")

    val apps = listOf("Instagram","TcgPlayer","Phone","safari","Messanger")
    val movies = setOf("Speed","Hackers","up","nope","GrandmasBoy","up",)
    val profile = mapOf(
        "name" to "Richard",
        "age" to "35",
        "city" to "Livermore",
        "program" to "MDI2"
    )
    for (app in apps){
        println(app)
    }
    for (movie in movies){
        println(movie)
    }
    println("Total of unique movies: ${movies.size}")
    for ((key, value)in profile) {
        println("$key: $value")
    }

    println("===== immutable list EX =====")

    val cars =listOf("Handa","BMW","Ford","Chevy","Audie")

    println(cars)
    println("First car: ${cars[0]}")
    println("Second car: ${cars[1]}")

    for ( car in cars){
        println(car)
    }
    println("===== Challenge EX =====")

    val games = listOf("Uncharted","Star Citizen","EFT","WarDogs","TBD")
    println("Game 1 is: ${games[0]}")
    println("last game is: ${games[3]}")
    for (game in games ){
        println("$games")
    }
    println("===== Mutable list EX =====")

    val vegetables = mutableListOf("Carrot","Tomato","Broccoli","Cucumber","Celery")
    println(vegetables)
    vegetables.add("corn")
    println(vegetables)

    vegetables.remove( "broccoli")
    println(vegetables)

    println("===== challenge4 EX =====")
    val favFood = mutableListOf("Pizza","Pasta","CheeseStake",)
    println(favFood)
    favFood.add("soup")
    println(favFood)

    favFood.remove("Pasta")
    println(favFood)


    println("===== function EX =====")
    sayHello()
    greetUser("richard")

    //val result = addNumbers(18,9)
   // println(result)

    favMovie()

    val result = multNumbers(2,2,2)
    println(result)
}
    fun sayHello(){
        println("Hello from a func")
    }
fun greetUser(name: String){
    println("Hello, $name")
}
fun addNumbers(number1: Int, number2: Int): Int {
    return number1 + number2
}
fun favMovie(){
    println("My Favorite movie is idk theres to many")
}
fun multNumbers(number1: Int, number2: Int,number3: Int): Int {
    return number1 * number2 * number3
}
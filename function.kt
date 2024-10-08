fun main() {
//     val greeting = birthdayGreeting("Abdelilah", 22)
    println(birthdayGreeting("Abdelilah", 22))
    println(birthdayGreeting("Amire", 7))
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

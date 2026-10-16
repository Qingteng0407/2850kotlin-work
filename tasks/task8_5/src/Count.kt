// Task 8.5: example of a higher-order function
fun howMany(number: String, action: (string) -> Int):Int{
    return action(numbers)
}

fun main() {
    println("Enter several numbers")
    val numbers = readln()
    val count = howMany(numbers){ numbr: String ->
        it.length
    }
    count(number)
}
// 写的有点乱，只是为了强行使用high-order function
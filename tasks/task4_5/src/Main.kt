// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val max = args[0].toInt()
    var sum = 0
    for (num in 1..max step 2){
        sum += num
    }
    println(sum)
}

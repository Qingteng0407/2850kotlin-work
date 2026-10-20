// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    val data = readData(args[0])
    val result = variance(data)
    println("Variance: $result")
}

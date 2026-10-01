// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 2) {
        println("Error: filename required as 2 argument")
        exitProcess(1)
    }else {
        val fruitA = args[0]
        val fruitB = args[1]
        println(fruitA)
        println(fruitB)
    }
}

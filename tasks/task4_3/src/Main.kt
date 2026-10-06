import kotlin.system.exitProcess
import kotlin.math.roundToInt
// Task 4.3: grade calculation using a when expression

fun main(args: Array<String>){
    if(args.size != 3){
        println("Error: filename required 3 argument")
        exitProcess(1)
    }
    else{
        val a = args[0].toInt()
        val b = args[1].toInt()
        val c = args[2].toInt()

        val average = (a + b + c)/3

        val grade = when (average){
            in 0..39   -> "Fail"
            in 40..69  -> "Pass"
            in 70..100 -> "Distinction"
            else       -> "?"
        }
        println(grade)
    }
}
//Copy the source files from Task 5.1.2 here!
import kotlin.random.Random

fun rollDie(sides: Int = 6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}
fun main(args: Array<String>){
    if (args.isEmpty()){
        rollDie()
    }else {
        rollDie(args[0].toInt())
    }
}
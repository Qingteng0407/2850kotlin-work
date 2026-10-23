// Task 12.3.2: demo of Person class with secondary constructor
fun main(){

    val n1 = Person("Jack", 2000, false)
    val n2 = Person("", 2010, true)
    println("the first person ${n1.x} born in ${n1.y} " +
            "and ${if (n1.z) "married" else "single"}")
}

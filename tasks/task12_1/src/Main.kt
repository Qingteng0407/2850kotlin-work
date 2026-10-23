// Task 12.1: program that uses a Point object
fun main(){
    val p1 = Point(3.0,4.0)

    println(p1.x)
    println(p1.y)

    val origion = Point(0.0,0.0)
    println(p1.distanceTo(origion))

    val p2 = Point(4.5,7.0)
    println(p1.distanceTo(p2))
}
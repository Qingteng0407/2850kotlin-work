// Task 12.1: Point class
import kotlin.math.sqrt
class Point(val x:Double,
            val y:Double
) {
    fun distanceTo(other:Point):Double{
        val distance = sqrt((x - other.x)*(x - other.x) + (y - other.y)*(y - other.y))
        return distance
    }
}

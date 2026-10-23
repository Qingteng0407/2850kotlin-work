// Task 12.4.1: Circle class
class Circle(val center:Point, val radius: Double){
    init {
        require(radius > 0) {
            "Radius must be positive"
        }
    }

}
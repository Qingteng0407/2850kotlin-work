// Task 12.3.2: Person class with secondary constructor
class Person(val x:String, val y:Int, val z: Boolean ){
    // 全都标记未婚
    constructor(x:String, y:Int):this(x,y,false)
    init {require(x.isNotBlank()) { "Name cannot be blank" }}
}

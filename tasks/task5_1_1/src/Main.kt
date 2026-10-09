// Task 5.1.1: main program

fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

//传参，用array接收string类型的参数，执行比较函数
fun main(args: Array<String>){
    val result = anagrams(args[0], args[1])
    println(result)
}

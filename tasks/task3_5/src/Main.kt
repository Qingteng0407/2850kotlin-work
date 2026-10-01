// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val filePath = Path("src/text.txt")
    val mes = filePath.readText()
    println(mes)
    val newMes = "你过哪国节"
    filePath.appendText(newMes)
}

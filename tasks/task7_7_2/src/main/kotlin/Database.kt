// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.readLines
import kotlin.io.path.writeLines

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()
// 读取文件中的名字写入文件
//文件 → List → Map（读取数据）
fun Database.load(filename: String) {
    val lines = Path(filename).readLines()

    for (line in lines) {
        val parts = line.split(",")

        if (parts.size == 2) {
            this[parts[0]] = parts[1]
        }
    }
}
// 读取数据库中的数据写入文件
fun Database.save(filename: String) {
    val lines = mutableListOf<String>()

    for ((key, value) in this) {
        lines.add("$key,$value")
    }

    Path(filename).writeLines(lines)
}

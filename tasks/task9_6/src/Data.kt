// Task 9.6: readData() function
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun readData(filename: String) = buildList {
    // 读取文件中的数据并创建list
    Path(filename).forEachLine {
        add(it.toDouble())
    }
}
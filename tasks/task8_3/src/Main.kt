// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.isEmpty()) {
        println("Please provide a filename")
        return
    }
    // 读取从文件名里传递进来的数据
    val data = fetchData(args[0])
    // 从文件的第二个里面的数字计算平均数
    val average = data.map { it.second }.average()
}

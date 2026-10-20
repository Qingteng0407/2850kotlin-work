// Task 8.3: functions for temperature analysis

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import java.io.File

typealias Record = Pair<String,Double>

fun fetchData(filename: String) = buildList {
    // Finish the implementation of this function
    val lines = File(filename).readLines()

    for (line in lines){
        val parts = line.split(",")
        val station = parts[0]
        val temperature = parts[1].toDouble()

        // 把一条记录加入list
        add(Pair(station, temperature))
    }

}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}



// Task 9.6: variance() function
fun variance(dataset: List<Double>): Double{
    require(dataset.size > 1 ){ "not enough data" }

    val mean = dataset.average()
    var sum = 0.0

    for (num in dataset){
        val difference = num - mean
        sum += difference * difference
    }
    val variance = sum / (dataset.size - 1)
    return variance
}

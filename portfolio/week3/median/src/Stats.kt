// Name: Qingteng Zhang Id: 201821913
// 计算中位数
fun median (num: List<Float>):Float{
    require(num.isNotEmpty()) {
        "List cannot be empty"
    }
    val sorted = num.sorted()
    val n = sorted.size

    if (n % 2 == 1){
        return sorted[n / 2] //小数部分会被直接舍去，如3/2=1
    }else{
        return (sorted[n/2] + sorted[n/2 -1])/2//返回index为[n/2]和[n/2 -1]
    }
}
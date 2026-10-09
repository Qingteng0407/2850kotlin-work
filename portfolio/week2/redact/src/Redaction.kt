// COMP2850 Portfolio: Week 2
// name:Qingteng Zhang Id:201821913
// Function to redact sensitive information in a string
fun redact (mes1: String, mes2: String, mes3: Char = 'X'): String{
    val length = mes2.length
    var hid = ""
    for (i in 1..length){
        hid += mes3
    }
    // replace initial message with hidden message
    val result = mes1.replace(mes2, hid)

    return result
}

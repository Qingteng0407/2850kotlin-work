// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // 创建空列表作为联系方式的格式：（name, phone）
    val contacts = createDatabase()
    println("Enter the name：")
    val name = readln()
    println("Enter the name：")
    val phone = readln()
    contacts[name] = phone

    contacts.save("contatc.csv")
    // (You can add other functions to this file if you wish)
}

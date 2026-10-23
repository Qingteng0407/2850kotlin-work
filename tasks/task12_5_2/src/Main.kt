// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person(
        "Jack",
        LocalDate(2000, 1, 1))

    p.name = "Jane"

    println(p)
}
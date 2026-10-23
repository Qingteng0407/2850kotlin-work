// Task 12.5.1: investigating the nature of properties

import kotlinx.datetime.LocalDate

class Person(_name: String, val birth: LocalDate) {
    var isMarried = false
    var name = _name
        get() {
            return field.uppercase()
        }
}

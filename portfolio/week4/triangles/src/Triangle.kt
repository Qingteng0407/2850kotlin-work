// COMP2850 Portfolio: Week 4
// Name:Qingteng Zhang Id:201821913
// Triangle class

import kotlin.math.sqrt
class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    // initialiser
    init {
        require(
            sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA
        ) { "side cannot be negative" }
    }

    // tree computing property
    val perimeter: Double
        get() = sideA + sideB + sideC

    val semiPerimeter: Double
        get() = perimeter / 2

    val area: Double
        get() = sqrt(
            semiPerimeter *
                    (semiPerimeter - sideA) *
                    (semiPerimeter - sideB) *
                    (semiPerimeter - sideC)
        )

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}


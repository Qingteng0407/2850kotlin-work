// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Median of 1 element" {
        median(listOf(5.0f)) shouldBe 5.0f
    }
    "Median of 2 element" {
        median(listOf(2.0f, 8.0f)) shouldBe 5.0f
    }
    "Median of 3 element" {
        median(listOf(2.0f, 5.0f, 8.0f)) shouldBe 5.0f
    }
    "Median of 4 element" {
        median(listOf(2.0f, 4.0f, 6.0f, 8.0f)) shouldBe 5.0f
    }
})

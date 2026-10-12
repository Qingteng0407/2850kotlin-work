// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    fun markOfFiftyFiveGivesPass() {
        assertEquals("Pass", grade(55))
    }

}

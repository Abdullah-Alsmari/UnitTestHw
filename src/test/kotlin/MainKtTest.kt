import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun main() {

        class ExampleUnitTest {

            @Test
            fun addition_isCorrect() {
                assertEquals(4, 2 + 2)
            }
            @Test
            fun minus_isCorrect() {
                assertEquals(4, 6 - 2)
            }
            @Test
            fun divided_isCorrect() {
                assertEquals(3, 6 / 2)
            }
            @Test
            fun multiplied_isCorrect() {
                assertEquals(12, 6 * 2)
            }

        }
    }
}
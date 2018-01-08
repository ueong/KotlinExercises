package simplemath

import org.junit.Assert.*
import org.junit.Test

class SimpleMathTest {
    @Test
    fun testSimpleMath() {
        var outputStream = util.getEmptySystemOutputStream()
        util.setSystemInputStream("10\r\n5\r\n")
        simpleMath()
        assertEquals("What is the first number? What is the second number? 10 + 5 = 15\r\n10 - 5 = 5\r\n10 * 5 = 50\r\n10 / 5 = 2\r\n", outputStream.toString())

        outputStream = util.getEmptySystemOutputStream()
        util.setSystemInputStream("8\r\n4\r\n")
        simpleMath()
        assertEquals("What is the first number? What is the second number? 8 + 4 = 12\r\n8 - 4 = 4\r\n8 * 4 = 32\r\n8 / 4 = 2\r\n", outputStream.toString())
    }
}
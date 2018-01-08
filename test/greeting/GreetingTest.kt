package greeting

import org.junit.Assert.assertEquals
import org.junit.Test

class GreetingTest {
    @Test
    fun testGreet() {
        var outContent = util.getEmptySystemOutputStream()
        util.setSystemInputStream("Kate\r\n")
        greet()
        assertEquals("What is your name? Hello, Kate, nice to meet you!\r\n", outContent.toString())

        outContent = util.getEmptySystemOutputStream()
        util.setSystemInputStream("Brian\r\n")
        greet()
        assertEquals("What is your name? Hello, Brian, nice to meet you!\r\n", outContent.toString())
    }
}
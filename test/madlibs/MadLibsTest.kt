package madlibs

import org.junit.Assert.assertEquals
import org.junit.Test

class MadLibsTest {
    @Test
    fun testMadLibs() {
        var outContent = util.getEmptySystemOutputStream()
        util.setSystemInputStream("dog\r\nwalk\r\nblue\r\nquickly\r\n")
        madLibs()
        assertEquals("Enter a noun: Enter a verb: Enter an adjective: Enter an adverb: Do you walk your blue dog quickly? That's hilarious!\r\n", outContent.toString())

        outContent = util.getEmptySystemOutputStream()
        util.setSystemInputStream("cat\r\nwalk\r\nblue\r\nquickly\r\n")
        madLibs()
        assertEquals("Enter a noun: Enter a verb: Enter an adjective: Enter an adverb: Do you walk your blue cat quickly? That's hilarious!\r\n", outContent.toString())

        outContent = util.getEmptySystemOutputStream()
        util.setSystemInputStream("dog\r\nrun\r\nblue\r\nquickly\r\n")
        madLibs()
        assertEquals("Enter a noun: Enter a verb: Enter an adjective: Enter an adverb: Do you run your blue dog quickly? That's hilarious!\r\n", outContent.toString())

        outContent = util.getEmptySystemOutputStream()
        util.setSystemInputStream("dog\r\nwalk\r\nwhite\r\nquickly\r\n")
        madLibs()
        assertEquals("Enter a noun: Enter a verb: Enter an adjective: Enter an adverb: Do you walk your white dog quickly? That's hilarious!\r\n", outContent.toString())

        outContent = util.getEmptySystemOutputStream()
        util.setSystemInputStream("dog\r\nwalk\r\nblue\r\nslowly\r\n")
        madLibs()
        assertEquals("Enter a noun: Enter a verb: Enter an adjective: Enter an adverb: Do you walk your blue dog slowly? That's hilarious!\r\n", outContent.toString())
    }
}
package wordcount

import org.junit.Assert.assertEquals
import org.junit.Test

class WordCountTest {
    @Test
    fun testWordCount() {

        var outContent = util.getEmptySystemOutputStream()
        util.setSystemInputStream("Homer\r\n")
        wordCount()
        assertEquals("What is the input string? Homer has 5 characters.\r\n", outContent.toString())

        outContent = util.getEmptySystemOutputStream()
        util.setSystemInputStream("John\r\n")
        wordCount()
        assertEquals("What is the input string? John has 4 characters.\r\n", outContent.toString())
    }

    @Test
    fun testJustInputEnter() {
        var outContent = util.getEmptySystemOutputStream()
        util.setSystemInputStream("\r\nHomer\r\n")
        wordCount()
        assertEquals("What is the input string? Input something, please.\r\nWhat is the input string? Homer has 5 characters.\r\n", outContent.toString())
    }
}


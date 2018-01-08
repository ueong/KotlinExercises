package quote

import org.junit.Assert.assertEquals
import org.junit.Test

class QuoteTest {
    @Test
    fun quoteTest() {
        var outContent = util.getEmptySystemOutputStream()
        util.setSystemInputStream("These aren't the droids you're looking for\r\nObi-Wan Kenobi\r\n")
        quote()
        assertEquals("What is the quote? Who said it? Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"\r\n", outContent.toString())

        outContent = util.getEmptySystemOutputStream()
        util.setSystemInputStream("Hello! Brian, nice to meet you\r\nSam\r\n")
        quote()
        assertEquals("What is the quote? Who said it? Sam says, \"Hello! Brian, nice to meet you.\"\r\n", outContent.toString())
    }
}

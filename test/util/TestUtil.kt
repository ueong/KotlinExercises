package util

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun setSystemInputStream(value : String) {
    System.setIn(ByteArrayInputStream(value.toByteArray()))
}

fun getEmptySystemOutputStream() : ByteArrayOutputStream {
    val outStream = ByteArrayOutputStream()
    System.setOut(PrintStream(outStream))
    return outStream
}

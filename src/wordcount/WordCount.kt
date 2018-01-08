package wordcount

private fun count(s: String?): String {
    return "$s has ${s?.length} characters."
}

private fun input(): String? {
    print("What is the input string? ")
    val input: String? = readLine()
    if (input.isNullOrBlank()) {
        println("Input something, please.")
        return input()
    }
    return input
}

fun wordCount() = println(count(input()))

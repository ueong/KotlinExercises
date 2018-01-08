package quote

fun quote() {
    println(makeQuote(inputQuote(), inputWho()))
}

// 문제의 조건에서 string concatenation을 사용하도록 강제해서 사용함.
private fun makeQuote(quote: String?, who: String?) = who + " says, \"" + quote + ".\""

private fun inputWho(): String? {
    print("Who said it? ")
    return readLine()
}

private fun inputQuote(): String? {
    print("What is the quote? ")
    return readLine()
}

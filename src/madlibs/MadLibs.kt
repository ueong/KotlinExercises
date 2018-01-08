package madlibs

fun madLibs() {
    val noun = inputNoun()
    val verb = inputVerb()
    val adjective = inputAdjective()
    val adverb = inputAdverb()
    println("Do you $verb your $adjective $noun $adverb? That's hilarious!")
}

private fun inputNoun(): String? {
    print("Enter a noun: ")
    return readLine()
}

private fun inputVerb(): String? {
    print("Enter a verb: ")
    return readLine()
}

private fun inputAdjective(): String? {
    print("Enter an adjective: ")
    return readLine()
}

private fun inputAdverb(): String? {
    print("Enter an adverb: ")
    return readLine()
}

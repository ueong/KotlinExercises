package greeting

private fun makeGreet(name :String?) : String? {
        if(name.isNullOrEmpty()) return null
        return "Hello, $name, nice to meet you!"
}

private fun printGreet(greet : String?) {
    println(greet)
}

private fun inputName() : String? {
    print("What is your name? ")
    return readLine()
}

fun greet() = printGreet(makeGreet(inputName()))

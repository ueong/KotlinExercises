package simplemath

fun simpleMath() {
    print("What is the first number? ")
    val firstNumber = readLine()!!.toInt()
    print("What is the second number? ")
    val secondNumber = readLine()!!.toInt()
    println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}\r\n" +
            "$firstNumber - $secondNumber = ${firstNumber - secondNumber}\r\n" +
            "$firstNumber * $secondNumber = ${firstNumber * secondNumber}\r\n" +
            "$firstNumber / $secondNumber = ${firstNumber / secondNumber}")
}

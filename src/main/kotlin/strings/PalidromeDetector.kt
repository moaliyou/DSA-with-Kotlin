package strings

fun isPalindrome(text: String): Boolean {
    var startPointer = 0
    var endPointer = text.length - 1
    var isPalindrome = false

    while (startPointer <= endPointer) {
        if(text[startPointer] != text[endPointer]) {
            return false
        } else {
            isPalindrome = true
            startPointer++
            endPointer--
        }
    }

    return isPalindrome
}

fun main() {
    val text = "radar"
    println("Is $text palindrome? | ${isPalindrome(text)}")
}

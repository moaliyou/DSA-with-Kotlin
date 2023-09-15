package strings

fun findNextGreatestLetter(letters: CharArray, target: Char): Char {
    var startPointer = 0
    var endPointer = letters.size - 1

    while (startPointer <= endPointer) {
        val indexOfMiddleLetter = startPointer + (endPointer - startPointer) / 2
        val middleLetter = letters[indexOfMiddleLetter]

        if (target < middleLetter) {
            endPointer = indexOfMiddleLetter - 1
        } else {
            startPointer = indexOfMiddleLetter + 1
        }
    }
    return letters[startPointer % letters.size]
}

fun main() {
    val letters = charArrayOf('c', 'f', 'j')
    val target = 'm'

    val nextGreatestLetter = findNextGreatestLetter(letters, target)

    println(nextGreatestLetter)
}
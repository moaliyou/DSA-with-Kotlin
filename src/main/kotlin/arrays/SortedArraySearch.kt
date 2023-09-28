package arrays

import java.util.*

fun main() {
    val nums = intArrayOf(5,7,7,7,7,8,8,10)
    val target = 7

    println(findFirstAndLastIndexOfTarget(nums, target).contentToString())
}

fun findFirstAndLastIndexOfTarget(array: IntArray, target: Int): IntArray {
    var result = intArrayOf(-1, -1)
    val firstOccurrence = getOccurrenceOfTarget(array, target, true)
    val lastOccurrence = getOccurrenceOfTarget(array, target, false)

    result[0] = firstOccurrence
    result[1] = lastOccurrence

    return result
}

private fun getOccurrenceOfTarget(elements: IntArray, target: Int, isFirstIndex: Boolean): Int {
    var result = -1
    var startPosition = 0
    var endPosition = elements.size - 1

    while (startPosition <= endPosition) {
        val indexOfMiddleElement = startPosition + (endPosition - startPosition) / 2
        val middleElement = elements[indexOfMiddleElement]

        if (middleElement == target) {
            result = indexOfMiddleElement
            if (isFirstIndex)
                endPosition = indexOfMiddleElement - 1
            else
                startPosition = indexOfMiddleElement + 1
        }

        if (target < middleElement) {
            endPosition = indexOfMiddleElement - 1
        } else if (target > middleElement) {
            startPosition = indexOfMiddleElement + 1
        }
    }
    return result
}
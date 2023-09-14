class BinarySearch {

    fun findElementIndex(elements: IntArray, target: Int): Int {
        var startPosition = 0
        var endPosition = elements.size - 1

        while (startPosition <= endPosition) {
            val indexOfMiddleElement = startPosition + (endPosition - startPosition) / 2

            if (target == elements[indexOfMiddleElement]) {
                return indexOfMiddleElement
            }

            if (isAscending(elements)) {
                if (target > elements[indexOfMiddleElement]) {
                    startPosition = indexOfMiddleElement + 1
                } else {
                    endPosition = indexOfMiddleElement - 1
                }
            } else {
                if (target < elements[indexOfMiddleElement]) {
                    startPosition = indexOfMiddleElement + 1
                } else {
                    endPosition = indexOfMiddleElement - 1
                }
            }
        }

        // Here we didn't find the target
        // in the given elements,
        // so we'll return `-1`
        return -1
    }

    private fun isAscending(elements: IntArray): Boolean {
        val firstIndex = 0
        val lastIndex = elements.size - 1
        return elements[firstIndex] < elements[lastIndex]
    }

}
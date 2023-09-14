class BinearySearch {

    fun findElementIndex(elements: IntArray, target: Int): Int {
        var startPosition = 0
        var endPosition = elements.size - 1

        while (startPosition <= endPosition) {
            val indexOfMiddleElement = startPosition + (endPosition - startPosition) / 2

            if (target == elements[indexOfMiddleElement]) {
                return indexOfMiddleElement
            } else if (target > elements[indexOfMiddleElement]) {
                startPosition = indexOfMiddleElement + 1
            } else {
                endPosition = indexOfMiddleElement - 1
            }
        }

        // Here we didn't find the target
        // in the given elements,
        // so we'll return `-1`
        return -1
    }

}
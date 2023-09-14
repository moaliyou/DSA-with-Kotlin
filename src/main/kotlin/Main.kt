fun main() {
    val elements = intArrayOf(2, 3, 4, 5, 6, 7, 8, 10, 12, 34, 59)
    val targetElement = 100

    val indexOfTargetElement = BinearySearch().findElementIndex(elements, target = targetElement)

    if (indexOfTargetElement != -1) {
        println(
            "The element $targetElement exists at index $indexOfTargetElement " +
                    "of array ${elements.contentToString()}."
        )
    } else {
        println(
            "The element $targetElement was not found " +
                    "in the array ${elements.contentToString()}."
        )
    }
}
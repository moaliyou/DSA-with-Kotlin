fun main() {
    val elementsInAscending = intArrayOf(
        -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 98
    )
//    val elementsInDescending = intArrayOf(
//        99, 80, 75, 22, 11, 10, 5, 2, -3
//    )
    val targetElement = 22

    val indexOfTargetElement = BinarySearch()
        .findElementIndex(
            elements = elementsInAscending,
            target = targetElement
        )

    if (indexOfTargetElement != -1) {
        println(
            "The element $targetElement exists at index $indexOfTargetElement " +
                    "of array ${elementsInAscending.contentToString()}."
        )
    } else {
        println(
            "The element $targetElement was not found " +
                    "in the array ${elementsInAscending.contentToString()}."
        )
    }
}
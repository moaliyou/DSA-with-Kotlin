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

    val numbers = intArrayOf(2, 3, 5, 9, 14, 16, 18)
    val target = 19

    println(BinarySearch().findCeilingNumber(numbers, target))
}
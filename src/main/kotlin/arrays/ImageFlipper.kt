package arrays

fun main() {

    val imageBinaryData = arrayOf(
        intArrayOf(1, 1, 0),
        intArrayOf(1, 0, 1),
        intArrayOf(0, 0, 0)
    )

    imageBinaryData.forEach { binaryData ->

        binaryData.reverse()

        for (data in binaryData.indices) {
            if (binaryData[data] == 0) {
                binaryData[data] = 1
            } else {
                binaryData[data] = 0
            }
        }
    }

    println(flipAndInvertImage(imageBinaryData).contentDeepToString())

}

fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
    val imageBinaryData = image

    imageBinaryData.forEach { binaryData ->

        binaryData.reverse()

        for (data in binaryData.indices) {
            if (binaryData[data] == 0) {
                binaryData[data] = 1
            } else {
                binaryData[data] = 0
            }
        }
    }

    return imageBinaryData
}
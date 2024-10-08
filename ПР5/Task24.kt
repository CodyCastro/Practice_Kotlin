fun main() {
    val matrix = arrayOf(
        arrayOf(3, 9, 0),
        arrayOf(11, 2, 7)
    )

    fun transposeMatrix(m: Array<Array<Int>>): Array<Array<Int>> {
        val rows = m.size
        val columns = m[0].size
        val transposedMatrix = Array(columns) { Array(rows) { 0 } }

        for (i in 0..<rows) {
            for (j in 0..<columns) {
                transposedMatrix[j][i] = m[i][j]
            }
        }

        return transposedMatrix
    }

    val transposedMatrix = transposeMatrix(matrix)

    println("Первоначальная матрица:")
    for(row in matrix) {
        println(row.contentToString())
    }

    println()

    println("Транспонированная матрица:")
    for(row in transposedMatrix) {
        println(row.contentToString())
    }
}
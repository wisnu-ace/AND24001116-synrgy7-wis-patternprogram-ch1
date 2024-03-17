class Pattern(private val printOption: PrintOption) {
    fun Triangle(height: Int, color: String){
        val baseWidth = 2 * height - 1
        for (row in 1..height) {
            val spaces = " ".repeat(height - row)
            val stars = "*".repeat(baseWidth - 2 * (height - row))
            printOption.printStar(color, spaces + stars + spaces)
            println()
        }
    }

    fun TriangleUpsideDown(height: Int, color: String){
        val baseWidth = 2 * height - 1
        for (row in height downTo 1) {
            val spaces = " ".repeat(height - row)
            val stars = "*".repeat(baseWidth - 2 * (height - row))
            printOption.printStar(color, spaces + stars + spaces)
            println()
        }
    }

    fun Diamond(height: Int, color: String){
        val mid = height / 2 + 1
        for (i in 1..mid) {
            for (j in mid - i downTo 1) {
                print(" ")
            }
            for (k in 1..2 * i - 1) {
                printOption.printStar(color, "*")
            }
            println()
        }
        for (i in mid - 1 downTo 1) {
            for (j in 1..mid - i) {
                print(" ")
            }
            for (k in 1..2 * i - 1) {
                printOption.printStar(color, "*")
            }
            println()
        }
    }

    fun xShape(size: Int, color: String){
        for (i in 0 until size) {
            for (j in 0 until size) {
                if (i == j || i + j == size - 1) {
                    printOption.printStar(color, "* ")
                } else {
                    print("  ")
                }
            }
            println()
        }
    }

    fun OutlinedTriangle(height: Int, color: String){
        val baseWidth = 2 * height - 1
        for (row in 1..height) {
            val spaces = " ".repeat(height - row)
            val stars = if (row == 1 || row == height) {
                "*".repeat(baseWidth - 2 * (height - row))
            } else {
                "*" + " ".repeat(baseWidth - 2 * (height - row) - 2) + "*"
            }
            printOption.printStar(color, spaces + stars + spaces)
            println()
        }
    }
}
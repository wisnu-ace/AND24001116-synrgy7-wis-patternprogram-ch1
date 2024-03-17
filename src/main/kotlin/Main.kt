fun main() {
    println("Welcome to shape print program!")
    val printOption = PrintOption()
    val pattern = Pattern(printOption)

    var patternOption: Int
    var height: Int = 0
    var colorOption: String = ""

    do {
        println("Pattern Options: \n1. Triangle\n2. Upside Down Triangle\n3. Diamond\n4. X Shape\n5. Outlined Triangle\n6. Exit")
        print("Please choose your pattern: ")
        patternOption = readLine()?.toIntOrNull() ?: 0

        if (patternOption in 1..5) {
            print("Enter the height/size: ")
            height = readLine()?.toIntOrNull() ?: 0

            println("Star color options: \n1. Normal\n2. Red\n3. Green")
            print("Please choose your star color option: ")
            val colorChoice = readLine()?.toIntOrNull() ?: 1

            colorOption = when (colorChoice) {
                1 -> "\u001b[0m"
                2 -> "\u001b[31m"
                3 -> "\u001b[32m"
                else -> "\u001b[0m"
            }
        }

        when (patternOption) {
            1 -> pattern.Triangle(height, colorOption)
            2 -> pattern.TriangleUpsideDown(height, colorOption)
            3 -> pattern.Diamond(height, colorOption)
            4 -> pattern.xShape(height, colorOption)
            5 -> pattern.OutlinedTriangle(height, colorOption)
            6 -> println("Stopping Program")
            else -> println("You must choose between 1-6")
        }
    } while (patternOption != 6)
}

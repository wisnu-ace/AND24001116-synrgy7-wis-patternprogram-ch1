class PrintOption {
    fun printStar(color: String, star: String) {
        print(color + star + "\u001b[0m")
    }
}
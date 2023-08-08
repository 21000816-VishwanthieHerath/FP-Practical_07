object Question01 extends App {

    def filterEvenNumbers(input: List[Int]): List[Int] = {
        input.filter(number => number % 2 == 0)
    }

    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputList = filterEvenNumbers(inputList)
    println(outputList)

}

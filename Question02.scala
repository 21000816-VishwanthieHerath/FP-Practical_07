object Main extends App {

  def calculateSquare(input: List[Int]): List[Int] = {
    input.map(number => number * number)
  }

  val inputList = List(1, 2, 3, 4, 5)
  val outputList = calculateSquare(inputList)

  println("Input List: " + inputList)
  println("Output List (Squares): " + outputList)

}

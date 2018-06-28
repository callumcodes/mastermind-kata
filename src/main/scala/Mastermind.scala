case class Mastermind(code: Code) {
  def evaluateGuess(guess: Code): List[String] = {
    val correctPegs = code.values.zip(guess.values).count {
      case (c, g) => c == g
    }
    List.fill(correctPegs)("Black")
  }
}

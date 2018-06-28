import org.scalatest.{FlatSpec, Matchers}

class MastermindSpec extends FlatSpec with Matchers {
  "evaluateGuess" should "return 4 Black pegs for correct guess of Red Red Red Red" in {
    Mastermind(Code(Red, Red, Red, Red)).evaluateGuess(Code(Red, Red, Red, Red)) shouldBe List.fill(4)("Black")
  }
  it should "return 3 Black pegs for guess of Red Red Red Blue when Red Red Red Red" in {
    Mastermind(Code(Red, Red, Red, Red)).evaluateGuess(Code(Red, Red, Red, Blue)) shouldBe List.fill(3)("Black")
  }
  it should "return 4 Black pegs for correct guess of Green Green Green Green" in {
    Mastermind(Code(Green, Green, Green, Green)).evaluateGuess(Code(Green, Green, Green, Green)) shouldBe List.fill(4)("Black")
  } 

  it should "return 4 Black pegs for correct guess of Yellow Black Green White" in {
    Mastermind(Code(Yellow, Black, Green, White)).evaluateGuess(Code(Yellow, Black, Green, White)) shouldBe List.fill(4)("Black")
  }

}
sealed trait CodePeg
case object Red extends CodePeg
case object Blue extends CodePeg
case object Green extends CodePeg
case object Yellow extends CodePeg
case object Black extends CodePeg
case object White extends CodePeg

case class Code(first: CodePeg, second: CodePeg, third: CodePeg, fourth: CodePeg) {
  val values: List[CodePeg] = List(first, second, third, fourth)
}

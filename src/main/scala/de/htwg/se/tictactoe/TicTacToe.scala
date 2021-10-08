@main def tictactoe: Unit =
  println("Welcome to TicTacToe")
  println(mesh)

val eol = sys.props("line.separator")
def bar(cellwidth: Int = 3, cells: Int = 3) =
  (("+" + "-" * cellwidth) * cells) + "+" + eol
def cells(cellwidth: Int = 3, cells: Int = 3) =
  ("|" + " " * cellwidth) * cells + "|" + eol
val mesh = (bar() + cells) * 3 + bar()

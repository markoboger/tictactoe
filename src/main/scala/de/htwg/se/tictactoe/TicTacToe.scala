@main def tictactoe: Unit =
  println("Welcome to TicTacToe")
  println(mesh())

val eol = sys.props("line.separator")
def bar(cellWidth: Int = 3, cellNum: Int = 3) = (("+" + "-" * cellWidth) * cellNum) + "+" + eol
def cells(cellWidth: Int = 3, cellNum: Int = 3) = ("|" + " " * cellWidth) * cellNum + "|" + eol
def mesh(cellWidth: Int = 3, cellNum: Int = 3) = (bar() + cells()) * cellNum + bar()

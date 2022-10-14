package de.htwg.se.tictactoe

val eol = sys.props("line.separator")
def bar(cellWidth: Int = 3, cellNum: Int = 3) = (("+" + "-" * cellWidth) * cellNum) + "+" + eol
def cells(cellWidth: Int = 3, cellNum: Int = 3) = ("|" + " " * cellWidth) * cellNum + "|" + eol
def mesh(cellWidth: Int = 3, cellNum: Int = 3) = (bar(cellWidth, cellNum) + cells(cellWidth, cellNum)) * cellNum + bar(cellWidth, cellNum)

enum Stone:
  case X, O, Y

@main def run: Unit =
  println("Welcome to TicTacToe")
  println(mesh())
  println(Stone.X)
  println(Stone.O)

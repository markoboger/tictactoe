package de.htwg.se.tictactoe

import de.htwg.se.tictactoe.model.Stone
import de.htwg.se.tictactoe.model.Matrix
import de.htwg.se.tictactoe.model.Field

@main def run: Unit =
  println("Welcome to TicTacToe")
  var field = new Field(3, Stone.Empty)
  println(field.toString)
  field = field.put(Stone.X, 0, 0)
  field = field.put(Stone.O, 1, 1)
  println(field.toString)

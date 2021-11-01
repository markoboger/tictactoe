package de.htwg.se.tictactoe

import de.htwg.se.tictactoe.model.Stone
import de.htwg.se.tictactoe.model.Matrix
import de.htwg.se.tictactoe.model.Field

@main def run: Unit =
  println("Welcome to TicTacToe")
  val field = new Field(3, Stone.Empty)
  println(field.toString)

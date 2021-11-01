package de.htwg.se.tictactoe

import controller.Controller
import aview.TUI
import model.Stone
import model.Matrix
import model.Field

@main def run: Unit =
  println("Welcome to TicTacToe")
  val field = new Field(3, Stone.Empty)
  val controller = Controller(field)
  val tui = TUI(controller)
  tui.run

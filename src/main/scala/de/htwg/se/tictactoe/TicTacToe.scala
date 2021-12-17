package de.htwg.se.tictactoe

import aview.FxGui
import aview.SwingGui
import aview.TUI
import controller.Controller
import model.Field
import model.Matrix
import model.Stone

@main def run: Unit =
  println("Welcome to TicTacToe")
  val field = new Field(3, Stone.Empty)
  val controller = Controller(field)
  //controller.add(FxGui)
  //FxGui.start()
  val swingGui = new SwingGui(controller)
  val tui = TUI(controller)
  tui.run

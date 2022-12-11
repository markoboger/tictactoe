package de.htwg.se.tictactoe
package aview

import controller.Controller
import model.Move
import model.Stone
import scalafx.application.JFXApp3
import scalafx.application.JFXApp3.PrimaryStage
import scalafx.scene.control.Label
import scalafx.scene.layout.BorderPane
import scalafx.scene.Scene
import util.Event
import util.Observer

class FxGui(controller: Controller) extends JFXApp3 with Observer:

  controller.add(this)
  println("Fx created")
  start()
  override def update(e: Event) =
    e match
      case Event.Quit => stopApp()
      case Event.Move => println("FX received event")

  override def start(): Unit =
    println("Start called...")
    stage = new PrimaryStage {
      title = "TicTacToe"
      width = 600
      height = 450
      scene = new Scene {
        root = new BorderPane {
          center = new Label("TicTacToe")
        }
      }
    }

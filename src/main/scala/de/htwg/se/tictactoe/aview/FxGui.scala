package de.htwg.se.tictactoe
package aview

import controller.Controller
import model.Move
import model.Stone
import scala.io.StdIn.readLine
import scalafx.application.JFXApp3
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle
import scalafx.scene.Scene
import scalafx.Includes._
import util.Event
import util.Observer

object FxGui extends JFXApp3 with Observer:

  override def update(e: Event) =
    e match
      case Event.Quit => stopApp()
      case Event.Move => this.start()

  override def start() = {
    stage = new JFXApp3.PrimaryStage {
      title.value = "TicTacToe"
      width = 600
      height = 450
      scene = new Scene {
        fill = LightGreen
        content = new Rectangle {
          x = 25
          y = 40
          width = 100
          height = 100
          //fill <== when(hover) choose Green otherwise Red
        }
      }
    }
  }

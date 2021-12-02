package de.htwg.se.tictactoe
package aview

import controller.Controller
import model.Move
import model.Stone
import scala.io.StdIn.readLine
// import scalafx.application.JFXApp3
// import scalafx.scene.paint.Color._
// import scalafx.scene.shape.Rectangle
// import scalafx.scene.Scene
// import scalafx.Includes._
import util.Observer

class GUI(controller: Controller) extends Observer: //extends JFXApp3 with Observer:
  controller.add(this)
  def run =
    println("GUI starting to run...")

  override def update = println("GUI updated")

// override def start(): Unit = {
//   stage = new JFXApp3.PrimaryStage {
//     title.value = "Hello Stage"
//     width = 600
//     height = 450
//     scene = new Scene {
//       fill = LightGreen
//       content = new Rectangle {
//         x = 25
//         y = 40
//         width = 100
//         height = 100
//         //fill <== when(hover) choose Green otherwise Red
//       }
//     }
//   }
// }

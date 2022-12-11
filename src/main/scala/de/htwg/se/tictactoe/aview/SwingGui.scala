package de.htwg.se.tictactoe
package aview

import controller.Controller
import model.Move
import model.Stone
import scala.swing._
import scala.swing.event._
import util.Event
import util.Observer

class SwingGui(controller: Controller) extends Frame with Observer:
  def cells = new CellPanel(3, 3)
  controller.add(this)
  title = "TicTacToe"
  menuBar = new MenuBar {
    contents += new Menu("File") {
      contents += new MenuItem(Action("Exit") {
        sys.exit(0)
      })
    }
  }
  contents = updateContents
  pack()
  centerOnScreen()
  open()

  def updateContents = {
    new BorderPanel {
      add(new Label("Player: " + controller.PlayerState.player), BorderPanel.Position.North)
      add(cells, BorderPanel.Position.Center)
    }
  }

  def update(e: Event): Unit = e match
    case Event.Quit => this.dispose
    case Event.Move => contents = updateContents; repaint

  class CellPanel(x: Int, y: Int) extends GridPanel(x, y):
    (for (
      x <- 0 to 2;
      y <- 0 to 2
    ) yield (x, y, controller.get(x, y))).foreach(t => contents += new CellButton(t._1, t._2, t._3))

  def button(stone: String) = new Button(stone)

  class CellButton(x: Int, y: Int, stone: String) extends Button(stone):
    listenTo(mouse.clicks)
    reactions += {
      case MouseClicked(src, pt, mod, clicks, props) => {
        controller.doAndPublish(controller.put, Move(controller.PlayerState.stone, x, y))
      }
    }

package de.htwg.se.tictactoe
package aview

import controller.Controller
import util.Observer
import model.Stone
import model.Move
import scala.swing._
import scala.swing.event._

class SwingGui(controller:Controller) extends Frame with Observer:
  controller.add(this)
  title = "TicTacToe"
  menuBar = new MenuBar {
    contents += new Menu("File") {
      contents += new MenuItem(Action("Exit") {
        sys.exit(0)
      })
    }
  }
  contents = new BorderPanel {
    add( new Label("Welcome to TicTacToe"), BorderPanel.Position.North)
    add( new CellPanel(2,2) , BorderPanel.Position.Center)
  }
  pack()
  centerOnScreen()
  open()

  def update: Unit = ()

  class CellPanel(x:Int, y:Int) extends GridPanel(x,y):
    List((0,0,"X"), (0,1,"O"), (1,0,""), (1,1,"")).foreach(t => contents += new CellButton(t._1,t._2,t._3))

    def button(stone:String) = new Button(stone)

  class CellButton(x:Int, y:Int, stone:String) extends Button(stone):
    listenTo(mouse.clicks)
    reactions += {
      case MouseClicked(src,pt,mod,clicks, props) => {
        controller.doAndPublish(controller.put,Move(Stone.X, x,y))
      }
    }

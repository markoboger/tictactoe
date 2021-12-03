package de.htwg.se.tictactoe.aview

import scala.swing._

class SwingGui:
  new Frame {
    title = "Hello world"

    contents = new FlowPanel {
      contents += new Label("Launch rainbows:")
      contents += new Button("Click me") {
        reactions += { case event.ButtonClicked(_) =>
          println("All the colours!")
        }
      }
    }

    pack()
    centerOnScreen()
    open()
  }

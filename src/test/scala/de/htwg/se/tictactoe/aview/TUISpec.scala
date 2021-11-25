package de.htwg.se.tictactoe
package aview

import controller.Controller
import model.Field
import model.Move
import model.Stone
import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class TuiSpec extends AnyWordSpec {

  "The TUI" should {
    val tui = TUI(Controller(new Field(3, Stone.Empty)))
    "recognize the input x12 as move of stone x to field (1,2)" in {
      tui.analyseInput("x12") should be(Some(Move(Stone.X, 1, 2)))
    }
    "recognize the input o00 as move of stone O to field (0,0)" in {
      tui.analyseInput("o00") should be(Some(Move(Stone.O, 0, 0)))
    }
  }
}

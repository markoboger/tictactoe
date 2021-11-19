package de.htwg.se.tictactoe.model

import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class MoveSpec extends AnyWordSpec {
  "A Move" should {
    "have a Stone, and a position with x and y coord." in {
      val move = Move(Stone.X, 1, 2)
      move.stone should be(Stone.X)
      move.x should be(1)
      move.y should be(2)
    }
  }
}

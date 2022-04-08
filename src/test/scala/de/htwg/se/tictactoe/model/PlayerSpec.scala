package de.htwg.se.tictactoe.model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class PlayerSpec extends AnyWordSpec {
  "A Player" should {
    val player = Player(name = "Oscar", stone = Stone.O)
    "have a name" in {
      player.name should be("Oscar")
    }
    "have initialy zero points" in {
      player.points should be(0)
    }
    "have a stone" in {
      player.stone should be(Stone.O)
    }

  }

}

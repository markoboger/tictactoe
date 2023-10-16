package de.htwg.se.tictactoe
package controller

import model.Field
import model.Move
import model.Stone
import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec
import util.Event
import util.Observer

class ControllerSpec extends AnyWordSpec {
  "The Controller" should {
    val controller = Controller(new Field(3, Stone.Empty))
    "put a stone on the field when a move is made" in {
      val fieldWithMove = controller.put(Move(Stone.X, 1, 2))
      fieldWithMove.get(1, 2) should be(Stone.X)
      fieldWithMove.get(0, 0) should be(Stone.Empty)
    }
    "notify its observers on change" in {
      class TestObserver(controller: Controller) extends Observer:
        controller.add(this)
        var bing = false
        def update(e: Event) = bing = true
      val testObserver = TestObserver(controller)
      testObserver.bing should be(false)
      controller.doAndPublish(controller.put, Move(Stone.X, 1, 2))
      testObserver.bing should be(true)
    }
    "undo and redo a move" in {
      var field = controller.field
      field = controller.put(Move(Stone.X, 1, 2))
      field.get(1, 2) should be(Stone.X)
      field = controller.undo
      field.get(1, 2) should be(Stone.Empty)
      field = controller.redo
      field.get(1, 2) should be(Stone.X)
    }
  }
}

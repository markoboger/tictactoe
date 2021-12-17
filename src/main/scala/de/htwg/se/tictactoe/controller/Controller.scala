package de.htwg.se.tictactoe
package controller

import model.Field
import model.Move
import model.Stone
import util.Command
import util.Event
import util.Observable
import util.UndoManager

case class Controller(var field: Field) extends Observable:
  val undoManager = new UndoManager[Field]
  def doAndPublish(doThis: Move => Field, move: Move) =
    field = doThis(move)
    notifyObservers(Event.Move)
  def doAndPublish(doThis: => Field) =
    field = doThis
    notifyObservers(Event.Move)
  def quit: Unit = notifyObservers(Event.Quit)
  def put(move: Move): Field = undoManager.doStep(field, PutCommand(move))
  def undo: Field = undoManager.undoStep(field)
  def redo: Field = undoManager.redoStep(field)
  override def toString = field.toString

package de.htwg.se.tictactoe
package controller

import model.Field
import model.Move
import model.Stone
import util.Observable

case class Controller(var field: Field) extends Observable:
  def doAndPublish(doThis: Move => Field, move: Move): Unit =
    field = doThis(move)
    notifyObservers
  def put(move: Move): Field =
    field.put(move.stone, move.x, move.y)
  override def toString = field.toString

package de.htwg.se.tictactoe
package controller

import model.Field
import model.Move
import model.Stone
import util.Observable

case class Controller(var field: Field) extends Observable:
  def doAndPublish(doThis: Move => Field, move: Move) =
    field = doThis(move)
    notifyObservers
  def put(move: Move) =
    field.put(move.stone, move.x, move.y)
  override def toString = field.toString

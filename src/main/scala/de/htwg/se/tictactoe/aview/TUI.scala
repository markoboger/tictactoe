package de.htwg.se.tictactoe
package aview

import controller.Controller
import model.Move
import model.Stone
import scala.io.StdIn.readLine
import util.Observer

class TUI(controller: Controller) extends Observer:
  controller.add(this)
  def run =
    println(controller.field.toString)
    inputLoop()

  override def update = println(controller.field.toString)

  def inputLoop(): Unit =
    analyseInput(readLine) match
      case None       =>
      case Some(move) => controller.doAndPublish(controller.put, move)
    inputLoop()

  def analyseInput(input: String): Option[Move] =
    input match
      case "q" => None
      case "z" => controller.doAndPublish(controller.redo); None
      case "y" => controller.doAndPublish(controller.undo); None
      case _ => {
        val chars = input.toCharArray
        val stone = chars(0) match
          case 'X' => Stone.X
          case 'x' => Stone.X
          case 'O' => Stone.O
          case 'o' => Stone.O
          case _   => Stone.Empty
        val x = chars(1).toString.toInt
        val y = chars(2).toString.toInt
        Some(Move(stone, x, y))
      }

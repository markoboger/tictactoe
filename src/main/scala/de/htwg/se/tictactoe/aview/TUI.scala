package de.htwg.se.tictactoe
package aview

import controller.Controller
import model.Stone
import scala.io.StdIn.readLine
import util.Observer

class TUI(controller: Controller) extends Observer:
  controller.add(this)
  def run =
    println(controller.field.toString)
    getInputAndPrintLoop()

  override def update = ???

  def getInputAndPrintLoop(): Unit =
    println("Enter your move (<Stone><x><y>, eg. x02, q to quit):")
    val input = readLine
    input match
      case "q" =>
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
        controller.put(stone, x, y)
        println(controller.toString)
        getInputAndPrintLoop()
      }

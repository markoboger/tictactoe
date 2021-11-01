package de.htwg.se.tictactoe

import de.htwg.se.tictactoe.model.Stone
import de.htwg.se.tictactoe.model.Matrix
import de.htwg.se.tictactoe.model.Field

import scala.io.StdIn.readLine

@main def run: Unit =
  println("Welcome to TicTacToe")
  var field = new Field(3, Stone.Empty)
  println(field.toString)
  getInputAndPrintLoop(field)

def getInputAndPrintLoop(field: Field): Unit =
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
      val newfield = field.put(stone, x, y)
      println(newfield)
      getInputAndPrintLoop(newfield)
    }

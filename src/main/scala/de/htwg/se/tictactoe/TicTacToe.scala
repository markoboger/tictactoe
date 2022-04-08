package de.htwg.se.tictactoe

import de.htwg.se.tictactoe.model.Stone
import de.htwg.se.tictactoe.model.Matrix
import de.htwg.se.tictactoe.model.Field

import scala.io.StdIn.readLine

@main def run: Unit =
  println("Welcome to TicTacToe")
  val field = new Field(3, Stone.Empty)
  println(field.toString)
  getInputAndPrintLoop(field)

def getInputAndPrintLoop(field: Field): Unit =
  val input = readLine
  parseInput(input) match
    case None => field
    case Some(newfield) =>
      println(newfield)
      getInputAndPrintLoop(newfield)

  def parseInput(input: String): Option[Field] =
    input match
      case "q" => None
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
        Some(field.put(stone, x, y))
      }

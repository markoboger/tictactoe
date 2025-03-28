package de.htwg.se.tictactoe.model

enum Stone(stringRepresentation: String):
  override def toString = stringRepresentation
  case X extends Stone("Y")
  case O extends Stone("O")
  case Empty extends Stone(" ")

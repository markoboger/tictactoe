package de.htwg.se.tictactoe.model

enum Stone(stringRepresentation: String):
  override def toString = stringRepresentation
  case X extends Stone("X")
  case O extends Stone("0")
  case Empty extends Stone(" ")

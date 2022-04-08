package de.htwg.se.tictactoe.model

case class Player(name: String, points: Int = 0, stone: Stone)

val oscar = Player(name = "Oscar", stone = Stone.O)
val xavier = Player(name = "Xavier", stone = Stone.X)

object Player:
  val list = List(oscar, xavier)
  def next = list.iterator.next

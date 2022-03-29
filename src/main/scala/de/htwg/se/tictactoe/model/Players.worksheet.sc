enum Stone:
  case X, O

case class Player(name: String, points: Int = 0, stone: Stone)

object Player:
  val oscar = Player(name = "Oscar", stone = Stone.O)
  val xavier = Player(name = "Xavier", stone = Stone.X)

  val list = List(oscar, xavier)
  var iter = list.iterator
  def next =
    if iter.hasNext then iter.next
    else {
      iter = list.iterator
      iter.next
    }
Player.list
Player.next
Player.next
Player.next
Player.next
Player.next

Player.oscar.stone
Player.xavier.stone

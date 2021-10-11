1 + 2

def f(x: Int) = x + 1
f(8)

val name = "Marko"
name

case class Player(name: String)
val player = Player("Marko")
player.name
val playerList = List(player)

val cells = Vector(Vector("x", "o", "x"), Vector(), Vector())
cells(0)(1)

enum Stone:
  case X, O, Empty

case class Matrix(rows: Vector[Vector[Stone]]):
  def cell(row: Int, col: Int) = rows(row)(col)
  def fill(filling: Stone): Matrix = copy(Vector.tabulate(3, 3) { (row, col) => filling })
  def replaceCell(row: Int, col: Int, cell: Stone) = copy(rows.updated(row, rows(row).updated(col, cell)))

val m = Matrix(Vector(Vector(Stone.X, Stone.O, Stone.X), Vector(), Vector()))
m.cell(0, 1)
val m2 = m.fill(Stone.Empty)
m2.replaceCell(1, 1, Stone.X)

package de.htwg.se.tictactoe.model

case class Field(matrix: Matrix[Stone]):
  def this(size: Int, filling: Stone) = this(new Matrix(size, filling))
  val size = matrix.size
  val eol = sys.props("line.separator")
  def bar(cellWidth: Int = 3, cellNum: Int = 3) = (("+" + "-" * cellWidth) * cellNum) + "+" + eol
  def cells(row: Int, cellWidth: Int = 3) =
    matrix.row(row).map(_.toString).map(" " * ((cellWidth - 1) / 2) + _ + " " * ((cellWidth - 1) / 2)).mkString("|", "|", "|") + eol
  def mesh(cellWidth: Int = 3) =
    (0 until size).map(cells(_, cellWidth)).mkString(bar(cellWidth, size), bar(cellWidth, size), bar(cellWidth, size))
  override def toString = mesh()

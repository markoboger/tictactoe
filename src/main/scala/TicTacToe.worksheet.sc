2+4
val eol = sys.props("line.separator")
def bar(cellWidth: Int = 3, cellNum: Int = 3) = (("+" + "-" * cellWidth) * cellNum) + "+" + eol
def cells(cellWidth: Int = 3, cellNum: Int = 3) = ("|" + " " * cellWidth) * cellNum + "|" + eol
def mesh(cellWidth: Int = 3, cellNum: Int = 3) = (bar(cellWidth, cellNum) + cells(cellWidth, cellNum)) * cellNum + bar(cellWidth, cellNum)


bar()
cells()
mesh()

// Simpler versions without string multiplication

// Version 0: Using multiline string (simplest)
def mesh0() = """+---+---+---+
|   |   |   |
+---+---+---+
|   |   |   |
+---+---+---+
|   |   |   |
+---+---+---+
"""
mesh0()

// Version 1: Three cell bar and cells using string literals
def bar1() = "+---+---+---+" + eol
def cells1() = "|   |   |   |" + eol
def mesh1() = bar1() + cells1() + bar1() + cells1() + bar1() + cells1() + bar1()
bar1()
cells1()
mesh1()

// Version 2: Three cell bar and cells using + concatenation
def bar2() = "+" + "-" + "-" + "-" + "+" + "-" + "-" + "-" + "+" + "-" + "-" + "-" + "+" + eol
def cells2() = "|" + " " + " " + " " + "|" + " " + " " + " " + "|" + " " + " " + " " + "|" + eol
def mesh2() = bar2() + cells2() + bar2() + cells2() + bar2() + cells2() + bar2()
bar2()
cells2()
mesh2()

// Version 3: Three cell bar and cells using concatenation with multiplication
def bar3() = "+" + "-" * 3 + "+" + "-" * 3 + "+" + "-" * 3 + "+" + eol
def cells3() = "|" + " " * 3 + "|" + " " * 3 + "|" + " " * 3 + "|" + eol
def mesh3() = bar3() + cells3() + bar3() + cells3() + bar3() + cells3() + bar3()
bar3()
cells3()
mesh3()

// Version 4: Three cell bar and cells with parameterized cell width
def bar4(cellWidth: Int = 3) = "+" + "-" * cellWidth + "+" + "-" * cellWidth + "+" + "-" * cellWidth + "+" + eol
def cells4(cellWidth: Int = 3) = "|" + " " * cellWidth + "|" + " " * cellWidth + "|" + " " * cellWidth + "|" + eol
def mesh4(cellWidth: Int = 3) = bar4(cellWidth) + cells4(cellWidth) + bar4(cellWidth) + cells4(cellWidth) + bar4(cellWidth) + cells4(cellWidth) + bar4(cellWidth)
bar4()
cells4()
mesh4()

// Version 5: Using printf-style formatting
def bar5() = "+%s+%s+%s+%s".format("---", "---", "---", eol)
def cells5() = "|%s|%s|%s|%s".format("   ", "   ", "   ", eol)
def mesh5() = "%s%s%s%s%s%s%s".format(bar5(), cells5(), bar5(), cells5(), bar5(), cells5(), bar5())
bar5()
cells5()
mesh5()

// Version 6: Using StringBuilder for construction
def bar6() = {
  val sb = new StringBuilder()
  sb.append("+")
  sb.append("-")
  sb.append("-")
  sb.append("-")
  sb.append("+")
  sb.append("-")
  sb.append("-")
  sb.append("-")
  sb.append("+")
  sb.append("-")
  sb.append("-")
  sb.append("-")
  sb.append("+")
  sb.append(eol)
  sb.toString()
}

def cells6() = {
  val sb = new StringBuilder()
  sb.append("|")
  sb.append(" ")
  sb.append(" ")
  sb.append(" ")
  sb.append("|")
  sb.append(" ")
  sb.append(" ")
  sb.append(" ")
  sb.append("|")
  sb.append(" ")
  sb.append(" ")
  sb.append(" ")
  sb.append("|")
  sb.append(eol)
  sb.toString()
}

def mesh6() = {
  val barLine = bar6()
  val cellLine = cells6()
  barLine + cellLine + barLine + cellLine + barLine + cellLine + barLine
}
bar6()
cells6()
mesh6()

// Version 7: Using List and mkString
def bar7() = {
  val parts = List("+", "---", "+", "---", "+", "---", "+", eol)
  parts.mkString("")
}

def cells7() = {
  val parts = List("|", "   ", "|", "   ", "|", "   ", "|", eol)
  parts.mkString("")
}

def mesh7() = {
  val barLine = bar7()
  val cellLine = cells7()
  List(barLine, cellLine, barLine, cellLine, barLine, cellLine, barLine).mkString("")
}
bar7()
cells7()
mesh7()

// Version 8: Using the final solution with ANSI colors
val RESET = "\u001b[0m"
val BLUE = "\u001b[34m"
val GREEN = "\u001b[32m"

def bar8(cellWidth: Int = 3, cellNum: Int = 3) = BLUE + (("+" + "-" * cellWidth) * cellNum) + "+" + RESET + eol
def cells8(cellWidth: Int = 3, cellNum: Int = 3) = GREEN + ("|" + " " * cellWidth) * cellNum + "|" + RESET + eol
def mesh8(cellWidth: Int = 3, cellNum: Int = 3) = (bar8(cellWidth, cellNum) + cells8(cellWidth, cellNum)) * cellNum + bar8(cellWidth, cellNum)
bar8()
cells8()
mesh8()
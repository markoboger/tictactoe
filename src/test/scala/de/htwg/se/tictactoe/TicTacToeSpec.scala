import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class TicTacToeSpec extends AnyWordSpec:
  "TicTacToe" should {
    "have a bar as String of form '+---+---+---+'" in {
      bar() should be("+---+---+---+" + eol)
    }
    "have a scalable bar" in {
      bar(1, 1) should be("+-+" + eol)
      bar(1, 2) should be("+-+-+" + eol)
      bar(2, 1) should be("+--+" + eol)
    }
  }

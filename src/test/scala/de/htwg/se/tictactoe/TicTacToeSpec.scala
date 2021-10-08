import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class TicTacToeSpec extends AnyWordSpec:
  "A bar" should {
    "return a String of form '+---+---+---+'" in {
      bar() should be("+---+---+---+" + eol)
    }
  }

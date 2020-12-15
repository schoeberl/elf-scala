package elfscala

import org.scalatest._
import flatspec._
import matchers._

class ElfTest extends AnyFlatSpec with should.Matchers {

  "Elf" should "have a version" in {
    println("Test version: " + Elf.version)
    assert(Elf.version != null)
  }
}

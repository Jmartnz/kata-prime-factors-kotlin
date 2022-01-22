import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class PrimeFactorsTest : FreeSpec ({
    "test one" {
        PrimeFactors(1).generate() shouldBe emptyList()
    }
    
})

class PrimeFactors(number: Int) {
    fun generate(): List<Int> = emptyList()

}

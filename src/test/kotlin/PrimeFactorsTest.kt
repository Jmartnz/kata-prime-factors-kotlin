import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class PrimeFactorsTest : FreeSpec ({
    "test one" {
        PrimeFactors(1).generate() shouldBe emptyList()
    }

    "test two" {
        PrimeFactors(2).generate() shouldBe listOf(2)
    }

})

class PrimeFactors(private val number: Int) {
    fun generate(): List<Int> {
        val primes = mutableListOf<Int>()
        if (number > 1) primes.add(2)
        return primes
    }

}

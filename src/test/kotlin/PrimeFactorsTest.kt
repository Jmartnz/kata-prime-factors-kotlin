import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

data class TestData(val number: Int, val expected: List<Int>)

class PrimeFactorsTest : FreeSpec ({
    listOf(
        TestData(1, emptyList()),
        TestData(2, listOf(2)),
        TestData(3, listOf(3)),
    ).forEach { (number, expected) ->
        "Prime factors of $number should be $expected" {
            PrimeFactors(number).generate() shouldBe expected
        }
    }

})

class PrimeFactors(private val number: Int) {
    fun generate(): List<Int> {
        val primes = mutableListOf<Int>()
        if (number > 1) primes.add(number)
        return primes
    }

}

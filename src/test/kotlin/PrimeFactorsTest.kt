import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

data class TestData(val number: Int, val expected: List<Int>)

class PrimeFactorsTest : FreeSpec ({
    listOf(
        TestData(1, emptyList()),
        TestData(2, listOf(2)),
        TestData(3, listOf(3)),
        TestData(4, listOf(2, 2)),
        TestData(6, listOf(2, 3)),
        TestData(8, listOf(2, 2, 2)),
        TestData(9, listOf(3, 3)),
    ).forEach { (number, expected) ->
        "Prime factors of $number should be $expected" {
            PrimeFactors(number).generate() shouldBe expected
        }
    }

})

class PrimeFactors(private var number: Int) {
    fun generate(): List<Int> {
        val primes = mutableListOf<Int>()
        var candidate = 2
        while (number > 1) {
            while (number % candidate == 0) {
                primes.add(candidate)
                number /= candidate
            }
            candidate++
        }
        return primes
    }

}

package lotto.domain

import lotto.domain.ManualPurchaseCount.Companion.ManualPurchaseCount
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ManualPurchaseCountTest {

    @Test
    fun `수동 구입 로또의 수는 구입개수를 넘을수 없다`() {
        assertThrows<IllegalArgumentException> { ManualPurchaseCount(15, 10) }
    }
}

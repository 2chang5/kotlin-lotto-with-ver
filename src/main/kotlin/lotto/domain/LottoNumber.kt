package lotto.domain

class LottoNumber(val value: Int) {
    init {
        require(value in LOTTO_MINIMUM_NUMBER..LOTTO_MAXIMUM_NUMBER) { LOTTO_NUMBER_RANGE_ERROR }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LottoNumber

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value
    }

    companion object {
        const val LOTTO_MINIMUM_NUMBER = 1
        const val LOTTO_MAXIMUM_NUMBER = 45

        private const val LOTTO_NUMBER_RANGE_ERROR = "로또 숫자는 $LOTTO_MINIMUM_NUMBER 이상 $LOTTO_MAXIMUM_NUMBER 이하 입니다."
    }
}

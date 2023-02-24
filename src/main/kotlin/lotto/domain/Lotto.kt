package lotto.domain

class Lotto(val lottoNumbers: Set<LottoNumber>) {

    init {
        validateLottoSize()
    }

    private fun validateLottoSize() {
        require(lottoNumbers.size == LOTTO_SIZE) { LOTTO_SIZE_ERROR }
    }

    fun countContainsMainLottoNumber(lotto: Lotto): Int =
        lottoNumbers.count { lottoNumber -> lottoNumber.value in lotto.lottoNumbers.map { it.value } }

    fun containsBonusLottoNumber(bonusNumber: LottoNumber): Boolean =
        bonusNumber.value in lottoNumbers.map { lottoNumber -> lottoNumber.value }

    companion object {
        const val LOTTO_SIZE = 6

        private const val LOTTO_SIZE_ERROR = "로또 숫자의 개수가 올바르지 않습니다."
    }
}

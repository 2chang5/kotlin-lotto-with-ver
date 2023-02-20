package lotto.constant

enum class Rank(val matchCount: Int, val prizeMoney: Int) {
    FIRST(6, 2000000000),
    SECOND(5, 30000000),
    THIRD(5, 1500000),
    FOURTH(4, 50000),
    FIFTH(3, 5000),
    NOTHING(-1, 0),
    ;

    companion object {
        fun convertToRank(matchCount: Int, bonusMatch: Boolean): Rank {
            if (matchCount == 5) {
                if (bonusMatch) return SECOND
                return THIRD
            }

            return Rank.values().find { it.matchCount == matchCount }
                ?: NOTHING
        }
    }
}

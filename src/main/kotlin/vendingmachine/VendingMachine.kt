package vendingmachine

class VendingMachine {
    var display: String = "INSERT COIN"

    fun insertCoin(d: Double) {
        display = when (d) {
            0.10 -> {
                "$0.10"
            }

            0.25 -> {
                "$0.25"
            }

            else -> {
                "$0.05"
            }
        }
    }
}

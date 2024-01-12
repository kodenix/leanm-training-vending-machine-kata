package vendingmachine

class VendingMachine {
    var display: String = "INSERT COIN"

    fun insertCoin(d: Double) {
        display = if (d == 0.10) {
            "$0.10"
        } else {
            "$0.05"
        }
    }
}

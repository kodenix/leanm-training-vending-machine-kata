package vendingmachine

class VendingMachine {
    var display: String = "INSERT COIN"

    fun insertCoin(d: Double) {
        display = if (d == 0.10) {
            "$0.10"
        } else if (d == 0.25) {
            "$0.25"
        } else {
            "$0.05"
        }
    }
}

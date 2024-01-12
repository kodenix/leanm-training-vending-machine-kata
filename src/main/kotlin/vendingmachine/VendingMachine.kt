package vendingmachine

class VendingMachine {
    var display: String = "INSERT COIN"

    fun insertCoin(d: Double) {
        display = "$0.05"
    }
}

package vendingmachine

import kotlin.math.roundToLong

class VendingMachine {
    private var currentAmount: Double = 0.0
    var display: String = "INSERT COIN"


    fun insertCoin(d: Double) {
        when (d) {
            0.10 -> {
                currentAmount +=0.10
            }

            0.25 -> {
                currentAmount +=0.25
            }

            0.05 -> {
                currentAmount +=0.05
            }

            else -> {

            }
        }

        display = getFormattedAmount(currentAmount)
    }

    private fun getFormattedAmount(amount: Double) = "$" + "%.2f".format(amount)

}

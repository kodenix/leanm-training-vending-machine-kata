package vendingmachine

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class VendingMachineShould {
    @Test
    fun `display insert coin when there is no coin inserted`() {
        val vendingMachine = VendingMachine()

        assertEquals(vendingMachine.display, "INSERT COIN")
    }
}

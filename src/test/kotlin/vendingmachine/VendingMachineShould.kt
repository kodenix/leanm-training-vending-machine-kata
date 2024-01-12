package vendingmachine

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class VendingMachineShould {
    @Test
    fun `display insert coin when there is no coin inserted`() {
        val vendingMachine = VendingMachine()

        assertEquals("INSERT COIN", vendingMachine.display)
    }

    @Test
    fun `display nickels amount when a nickel coin is inserted`() {
        val vendingMachine = VendingMachine()

        vendingMachine.insertCoin(0.05)

        assertEquals("$0.05", vendingMachine.display)
    }

    @Test
    fun `display updated amount when a nickel coin is inserted and there is already a coin inserted`() {
        val vendingMachine = VendingMachine()

        vendingMachine.insertCoin(0.05)
        vendingMachine.insertCoin(0.05)

        assertEquals("$0.10", vendingMachine.display)
    }

    @Test
    fun `display updated amount when a nickel coin is inserted and there is already two coin inserted`() {
        val vendingMachine = VendingMachine()

        vendingMachine.insertCoin(0.10)
        vendingMachine.insertCoin(0.05)

        assertEquals("$0.15", vendingMachine.display)
    }

    @Test
    fun `display dimes amount when a dime coin is inserted`() {
        val vendingMachine = VendingMachine()

        vendingMachine.insertCoin(0.10)

        assertEquals("$0.10", vendingMachine.display)
    }

    @Test
    fun `display updated amount when a dime coin is inserted and there is already two coin inserted`() {
        val vendingMachine = VendingMachine()
        vendingMachine.insertCoin(0.10)
        vendingMachine.insertCoin(0.10)
        assertEquals("$0.20", vendingMachine.display)
    }

    @Test
    fun `display quarter amount when a quarter coin is inserted`() {
        val vendingMachine = VendingMachine()

        vendingMachine.insertCoin(0.25)

        assertEquals("$0.25", vendingMachine.display)
    }

    @Test
    fun `display updated amount when a quarter coin is inserted and there is already two coin inserted`() {
        val vendingMachine = VendingMachine()
        vendingMachine.insertCoin(0.25)
        vendingMachine.insertCoin(0.25)
        assertEquals("$0.50", vendingMachine.display)
    }

    @Test
    fun `display current amount in display when an invalid coin is inserted`() {
        val vendingMachine = VendingMachine()
        vendingMachine.insertCoin(0.25)
        vendingMachine.insertCoin(0.01)

        assertEquals("$0.25", vendingMachine.display)
    }


    
}
